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
		System.out.println("������PersonControlʵ����");
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
		System.out.println("����Ա����¼������empLogin");
		
		String nextAction = "";//��ת·��
		
		//ʹ��ҵ�����֤��¼��
		TEmployee employee =  service.checkLogin(employee_name, password);//��ѯԱ�����û���/���룩-�������ʽ����RoleId
		if (employee != null) {
			if (employee.getRoleId().intValue()  == role_id) {
				session.setAttribute("employee", employee);
				String roleName = employee.getRole().getRoleName();
				if ("ϵͳ����Ա".equals(roleName)) {
					nextAction = "redirect:/admin/welcome.jsp";
				} else if ("����".equals(roleName)) {
					nextAction = "redirect:/manager/welcome.jsp";
				} else if ("Ա��".equals(roleName)) {
					System.out.println("��ͨԱ��");
					nextAction = "redirect:/person/welcome.jsp";
				}
			}else{
				map.put("message", "���û��޴˽�ɫ");
				nextAction = "error";
			}
			
		}else{
			map.put("message", "��¼ʧ�ܣ��û��������벻һ��");
			nextAction = "error";
		}
		return nextAction;
	}
	
	
	@RequestMapping("renwu.do")
	public String RenWuSelectById(String PageNo,String PageSize,HttpSession session){
		System.out.println("����RenWuSelect��������Ա����Ų�ѯ����");
		System.out.println("���ݵ�ҳ�룺"+PageNo);
		System.out.println("���ݵ���������"+PageSize);
		int pageNo=1;
		int pageSize=2;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		System.out.println("��ǰҳ�룺"+pageNo);
		System.out.println("��ǰҳ����������"+pageSize);
		TEmployee emp = (TEmployee) session.getAttribute("employee");
		System.out.println("Ա����ţ�"+emp.getEmployeeId()+"��Ա��������"+emp.getRealName());
		List<TTask> allRenWu = service.taskSelect(emp.getEmployeeId().intValue(),pageNo,pageSize);
		PageBean<TTask> page = new PageBean<TTask>();
		page.setData(allRenWu);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(service.SelectZongShu(emp.getEmployeeId().intValue()));
		System.out.println("����Ա����Ų�ѯ����������"+service.SelectZongShu(emp.getEmployeeId().intValue()));
		System.out.println("����Ա����Ų�ѯ�����ҳ�����"+page.getData());
		session.setAttribute("renwuAll", page);
		return "person/task.jsp";
	}
	
	@RequestMapping("renwuById.do")
	public String RenWuSelectById(Integer jihua_id,HttpSession session){
		TTask task = service.taskSelectById(jihua_id);
		System.out.println("��ѯ����"+task.toString());
		session.setAttribute("taskById", task);
		session.setAttribute("taskid", task.getTaskId());
		return jiHuaSelect(jihua_id, session);
	}
	
	@RequestMapping("jihua.do")
	public String jiHuaSelect(int renwu_id,HttpSession session){
		System.out.println("����jiHuaSelect����");
		List<TPlan> plan = service.planSelect(renwu_id);
		System.out.println("��ѯ����"+plan.toString());
		session.setAttribute("planAll", plan);
		return "person/taskview.jsp";
	}
	
	@RequestMapping("xinjian.do")
	public String Xinjian(@ModelAttribute("plan") TPlan plan,HttpSession seesion){
		return "person/newpro.jsp";
	}
	
	@RequestMapping("Insertjihua.do")
	public String jiHuaInsert(@ModelAttribute("plan") TPlan plan,int task_id,HttpSession session){
		System.out.println("��ţ�"+task_id);
		plan.setTaskId(new BigDecimal(task_id));
		plan.setStatus("δ���");
		plan.setIsFeedback("��");
		System.out.println("�½��ƻ������ݵĲ�����"+plan.toString());
		int count = service.PlanInsert(plan);
		System.out.println(count);
		return RenWuSelectById(task_id, session);
	}
	
	@RequestMapping("StatsSelected.do")
	public String RenWuStatusUpdate(String PageNo,String PageSize,String statusValue,Integer jihua_id,HttpSession session){
		System.out.println(statusValue);
		System.out.println(jihua_id);
		System.out.println("����");
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
				value = "δʵʩ";
			}else if("2".equals(statusValue)){
				value = "ʵʩ��";
			}else if("3".equals(statusValue)){
				value = "�����";
			}
			System.out.println(value);
			service.StatusUpdate(value, jihua_id);
			return RenWuSelectById(PageNo,PageSize,session);
		} catch (Exception e) {
			System.out.println("�޸�ʧ�ܣ�����");
			return RenWuSelectById(jihua_id, session);
		}
	}
	
	
	@RequestMapping("jihua_selectById.do")
	public String JiHuaSelectById(Integer jihuaId,HttpSession session){
		TPlan planById = service.planSelectById(jihuaId);
		System.out.println("�ƻ���"+planById.toString());
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
		System.out.println("�޸ı�ﴫ�ݵĲ�����"+plan);
		System.out.println("�ƻ�id��"+jihua_id);
		System.out.println("����id��"+task_id);
		plan.setTaskId(new BigDecimal(task_id));
		plan.setPlanId(new BigDecimal(jihua_id));
		System.out.println("��װ��"+plan);
		int count = service.planUpdate(plan);
		System.out.println(""+count+"�޸ģ�"+plan);
		return RenWuSelectById(task_id,session);
	}
	
	@RequestMapping("jihua_delete.do")
	public String JiHuaDelete(Integer jihua_id,Integer task_id,HttpSession session){
		if(jihua_id != null){
			int count = service.PlanDelete(jihua_id);
			System.out.println("ɾ�������"+count);
			return RenWuSelectById(task_id, session);
		}else{
			TTask t_id = (TTask) session.getAttribute("taskById");
			System.out.println("����ԭ��"+t_id.getTaskId());
			session.setAttribute("msg", "ɾ��ʧ�ܣ�");
			return "person/error.jsp";
		}
		
	}
	
	
	@RequestMapping("jiazairenwu.do")
	public String JiaZaiRenWu(Integer peronId,HttpSession session){
		TEmployee emp = (TEmployee) session.getAttribute("employee");
		System.out.println("��ϲ�ѯ���ݵ�Ա����ţ�"+emp.getEmployeeId());
		List<TTask> allrenwu = service.taskSelect(emp.getEmployeeId().intValue(),1,100);
		System.out.println(allrenwu);
		List<String> renuw_all = new ArrayList<String>();
		for (TTask string : allrenwu) {
			System.out.println("����Ա����Ų�ѯ�����������ƣ�"+string.getTaskName());
			renuw_all.add(string.getTaskName());
		}
		session.setAttribute("renuw_all", renuw_all);
		List<String> shifou = new ArrayList<String>();
		shifou.add("��");
		shifou.add("��");
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
