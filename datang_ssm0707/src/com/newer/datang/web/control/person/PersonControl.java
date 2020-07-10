package com.newer.datang.web.control.person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.entity.TTaskExample;
import com.newer.datang.data.service.person.PersonService;
import com.newer.datang.data.service.person.PlanDTO;
import com.newer.datang.data.util.PageBean;
import com.newer.datang.data.util.StringUtil;

@Controller
public class PersonControl {

	public PersonControl() {
		System.out.println("控制器PersonControl实例化");
	}
	
	@Resource(name="PersonServiceImpl")
	PersonService service;
	
	@RequestMapping("zhuxiao.do")
	public String ZhuXiao(HttpSession session){
		session.removeAttribute("employee");
		return "login.jsp";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping("DaTangLogin.do")
	public String empLogin(String employee_name, String password, Integer role_id,
			ModelMap map, HttpSession session) {
		System.out.println("进入员工登录方法：empLogin");
		
		String nextAction = "";//跳转路径
		
		//使用业务层验证登录：
		TEmployee employee =  service.checkLogin(employee_name, password);//查询员工表（用户名/密码）-〉外键形式存在RoleId
		if (employee != null) {
			if (employee.getRoleId().intValue()  == role_id) {
				session.setAttribute("employee", employee);
				String roleName = employee.getRole().getRoleName();
				if ("系统管理员".equals(roleName)) {
					nextAction = "redirect:/admin/welcome.jsp";
				} else if ("主管".equals(roleName)) {
					nextAction = "redirect:/manager/welcome.jsp";
				} else if ("员工".equals(roleName)) {
					System.out.println("普通员工");
					nextAction = "redirect:/person/welcome.jsp";
				}
			}else{
				map.put("message", "该用户无此角色");
				nextAction = "error";
			}
			
		}else{
			map.put("message", "登录失败，用户名和密码不一致");
			nextAction = "error";
		}
		return nextAction;
	}
	
	
	@RequestMapping("renwu.do")
	public String RenWuSelectById(String PageNo,String PageSize,HttpSession session){
		System.out.println("加载RenWuSelect方法根据员工编号查询任务");
		System.out.println("传递的页码："+PageNo);
		System.out.println("传递的数据量："+PageSize);
		int pageNo=1;
		int pageSize=2;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		System.out.println("当前页码："+pageNo);
		System.out.println("当前页的数据量："+pageSize);
		TEmployee emp = (TEmployee) session.getAttribute("employee");
		System.out.println("员工编号："+emp.getEmployeeId()+"，员工姓名："+emp.getRealName());
		List<TTask> allRenWu = service.taskSelect(emp.getEmployeeId().intValue(),pageNo,pageSize);
		PageBean<TTask> page = new PageBean<TTask>();
		page.setData(allRenWu);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(service.SelectZongShu(emp.getEmployeeId().intValue()));
		System.out.println("根据员工编号查询任务总数："+service.SelectZongShu(emp.getEmployeeId().intValue()));
		System.out.println("根据员工编号查询任务分页结果："+page.getData());
		session.setAttribute("renwuAll", page);
		return "person/task.jsp";
	}
	
	@RequestMapping("renwuById.do")
	public String RenWuSelectById(Integer jihua_id,HttpSession session){
		TTask task = service.taskSelectById(jihua_id);
		System.out.println("查询对象："+task.toString());
		session.setAttribute("taskById", task);
		session.setAttribute("taskid", task.getTaskId());
		return jiHuaSelect(jihua_id, session);
	}
	
	@RequestMapping("jihua.do")
	public String jiHuaSelect(int renwu_id,HttpSession session){
		System.out.println("加载jiHuaSelect方法");
		List<TPlan> plan = service.planSelect(renwu_id);
		System.out.println("查询对象："+plan.toString());
		session.setAttribute("planAll", plan);
		return "person/taskview.jsp";
	}
	
	@RequestMapping("xinjian.do")
	public String Xinjian(@ModelAttribute("plan") TPlan plan,HttpSession seesion){
		return "person/newpro.jsp";
	}
	
	@RequestMapping("Insertjihua.do")
	public String jiHuaInsert(@ModelAttribute("plan") TPlan plan,int task_id,HttpSession session){
		System.out.println("编号："+task_id);
		plan.setTaskId(new BigDecimal(task_id));
		plan.setStatus("未完成");
		plan.setIsFeedback("否");
		System.out.println("新建计划表单传递的参数："+plan.toString());
		int count = service.PlanInsert(plan);
		System.out.println(count);
		return RenWuSelectById(task_id, session);
	}
	
	@RequestMapping("StatsSelected.do")
	public String RenWuStatusUpdate(String PageNo,String PageSize,String statusValue,Integer jihua_id,HttpSession session){
		System.out.println(statusValue);
		System.out.println(jihua_id);
		System.out.println("加载");
		int pageNo=1;
		int pageSize=2;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		try {
			String value = "";
			if("1".equals(statusValue)){
				value = "未实施";
			}else if("2".equals(statusValue)){
				value = "实施中";
			}else if("3".equals(statusValue)){
				value = "已完成";
			}
			System.out.println(value);
			service.StatusUpdate(value, jihua_id);
			return RenWuSelectById(PageNo,PageSize,session);
		} catch (Exception e) {
			System.out.println("修改失败！！！");
			return RenWuSelectById(jihua_id, session);
		}
	}
	
	
	@RequestMapping("jihua_selectById.do")
	public String JiHuaSelectById(Integer jihuaId,HttpSession session){
		TPlan planById = service.planSelectById(jihuaId);
		System.out.println("计划："+planById.toString());
		session.setAttribute("planById", planById);
		return JiHuaFrom();
	}
	
	@RequestMapping("jihua_from.do")
	public String JiHuaFrom(){
		TPlan plan = new TPlan();
		return "person/feedback.jsp";
	}
	
	@RequestMapping("jihua_update.do")
	public String JiHuaUpdate(@ModelAttribute("plan") TPlan plan,Integer jihua_id,Integer task_id,HttpSession session){
		System.out.println("修改表达传递的参数："+plan);
		System.out.println("计划id："+jihua_id);
		System.out.println("任务id："+task_id);
		plan.setTaskId(new BigDecimal(task_id));
		plan.setPlanId(new BigDecimal(jihua_id));
		System.out.println("封装："+plan);
		int count = service.planUpdate(plan);
		System.out.println(""+count+"修改："+plan);
		return RenWuSelectById(task_id,session);
	}
	
	@RequestMapping("jihua_delete.do")
	public String JiHuaDelete(Integer jihua_id,Integer task_id,HttpSession session){
		if(jihua_id != null){
			int count = service.PlanDelete(jihua_id);
			System.out.println("删除结果："+count);
			return RenWuSelectById(task_id, session);
		}else{
			TTask t_id = (TTask) session.getAttribute("taskById");
			System.out.println("错误原因："+t_id.getTaskId());
			session.setAttribute("msg", "删除失败！");
			return "person/error.jsp";
		}
		
	}
	
	
	@RequestMapping("jiazairenwu.do")
	public String JiaZaiRenWu(Integer peronId,HttpSession session){
		TEmployee emp = (TEmployee) session.getAttribute("employee");
		System.out.println("组合查询传递的员工编号："+emp.getEmployeeId());
		List<TTask> allrenwu = service.taskSelect(emp.getEmployeeId().intValue(),1,100);
		System.out.println(allrenwu);
		List<String> renuw_all = new ArrayList<String>();
		for (TTask string : allrenwu) {
			System.out.println("根据员工编号查询所属任务名称："+string.getTaskName());
			renuw_all.add(string.getTaskName());
		}
		session.setAttribute("renuw_all", renuw_all);
		List<String> shifou = new ArrayList<String>();
		shifou.add("是");
		shifou.add("否");
		session.setAttribute("shifou", shifou);
		return "person/checkpro.jsp";
	}
	
	@RequestMapping("zuhe_select.do")
	public String JiHuaZuHeSelect(@ModelAttribute PlanDTO dto,String PageNo,String PageSize,HttpSession session){
		TEmployee emp = (TEmployee) session.getAttribute("employee");
		System.out.println(dto.toString());
		int pageNo=1;
		int pageSize=2;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		List<TPlan> allPlan = service.query(dto, pageNo, pageSize, emp.getEmployeeId().intValue());
		PageBean<TPlan> page = new PageBean<TPlan>();
		page.setData(allPlan);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(service.Count(dto, emp.getEmployeeId().intValue()));
		session.setAttribute("page", page);
		return "person/checkpro.jsp";
	}
}
