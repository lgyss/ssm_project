package com.newer.datang.web.control.manager;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.service.manager.TaskService;
import com.newer.datang.data.util.PageBean;
import com.newer.datang.data.util.StringUtil;


@Controller
public class MyControl {
	
	@Resource(name="taskservice")
	TaskService tasks;
	
	@ModelAttribute("task")
	public TTask load(HttpSession session){
		TEmployee emp=new TEmployee();
				emp.setEmployeeId(new BigDecimal(47));
		session.setAttribute("employee", emp);
		return new TTask();
	};
//	
//	
	//人员管理
	@RequestMapping("manager/lgemp.do")
	public void allemp(String PageNo,String PageSize,HttpServletRequest request,HttpServletResponse response) throws IOException {
		int pageNo=1;
		int pageSize=3;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		
		List<TEmployee> allemp = this.tasks.selectEmpByRarntId(emp.getEmployeeId().intValue(),pageNo,pageSize);
		PageBean<TEmployee> page = new PageBean<TEmployee>();
		page.setData(allemp);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(this.tasks.selectEmpByRarntId(emp.getEmployeeId().intValue(),1,100).size());
		System.out.println("根据员工编号查询任务总数："+this.tasks.selectEmpByRarntId(emp.getEmployeeId().intValue(),1,100).size());
		System.out.println("根据员工编号查询任务分页结果："+page.getData());
//		T_Employee emp=new T_Employee();
//		emp.setEmployee_ID(8);
		request.getSession().setAttribute("allemp", page);
		response.sendRedirect("checkper.jsp");
	}
//	
	//查看任务
	@RequestMapping("manager/lgtask.do")
	public void alltask(String PageNo,String PageSize,HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException {
		int pageNo=1;
		int pageSize=3;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		System.out.println("当前会话id"+request.getSession().getId());
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		System.out.println("当前会话里面的值+"+emp.getEmployeeId());
		//T_Employee emp=new T_Employee();
		//emp.setEmployee_ID(8);
		
		List<TTask> allTask = this.tasks.allTask(emp,pageNo,pageSize,"");

		PageBean<TTask> page = new PageBean<TTask>();
		page.setData(allTask);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(this.tasks.allTask(emp,1,100,"").size());
		System.out.println("根据员工编号查询任务总数："+this.tasks.allTask(emp,1,100,"").size());
		System.out.println("根据员工编号查询任务分页结果："+page.getData());
		request.getSession().setAttribute("allTask", page);
		response.sendRedirect("taskview.jsp");
	}
	//加载制定任务的下拉框
	@RequestMapping("manager/lgtaskput.do")
	public void taskput(HttpServletRequest request,HttpServletResponse response) throws IOException {
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		//T_Employee emp=new T_Employee();
		//emp.setEmployee_ID(8);
		request.getSession().setAttribute("selectTask", this.tasks.selectEmpByRarntId(emp.getEmployeeId().intValue(),1,100));
		response.sendRedirect("task.jsp");
	}
//	
	//调整任务
	@RequestMapping("manager/lgtaskundone.do")
	public void alltaskundone(String PageNo,String PageSize,HttpServletRequest request,HttpServletResponse response) throws IOException {
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		//T_Employee emp=new T_Employee();
		//emp.setEmployee_ID(8);
		int pageNo=1;
		int pageSize=3;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		List<TTask> list=this.tasks.allTask(emp,pageNo,pageSize,"未实施");
		PageBean<TTask> page = new PageBean<TTask>();
		page.setData(list);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(this.tasks.allTask(emp,1,100,"未实施").size());
		System.out.println("根据员工编号查询任务总数："+this.tasks.allTask(emp,1,100,"未实施").size());
		System.out.println("根据员工编号查询任务分页结果："+page.getData());
		request.getSession().setAttribute("allTask",page);
		response.sendRedirect("taskundone.jsp");
	}
//
	//跟踪实施中的任务
	@RequestMapping("manager/lgtaskdance.do")
	public void alltaskdance(String PageNo,String PageSize,HttpServletRequest request,HttpServletResponse response) throws IOException {
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		//T_Employee emp=new T_Employee()；
		//emp.setEmployee_ID(8);
		int pageNo=1;
		int pageSize=3;
		if(!StringUtil.isBlank(PageNo)){
			pageNo = Integer.parseInt(PageNo);
		}
		if(!StringUtil.isBlank(PageSize)){
			pageSize = Integer.parseInt(PageSize);
		}
		List<TTask> list=this.tasks.allTask(emp,pageNo,pageSize,"实施中");
		PageBean<TTask> page = new PageBean<TTask>();
		page.setData(list);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);
		page.setTotalRecords(this.tasks.allTask(emp,1,100,"实施中").size());
		System.out.println("根据员工编号查询任务总数："+this.tasks.allTask(emp,1,100,"实施中").size());
		System.out.println("根据员工编号查询任务分页结果："+page.getData());
		request.getSession().setAttribute("allTaskdance",page);
		response.sendRedirect("intendance.jsp");
	}
//	
//	
	//任务详细信息+计划
	@RequestMapping("manager/lgtaskinfo.do")
	public void taskinfo(@RequestParam("radiobutton") String task,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("当前pingjie的字符串"+task);
		String[] str=task.split("-");
		System.out.println("当前任务的计划数"+str[1]);
		request.getSession().setAttribute("lgtaskinfo", this.tasks.selectAllTaskByID(Integer.parseInt(str[0])));
		request.getSession().setAttribute("lgtask_plan", this.tasks.selectPlan(Integer.parseInt(str[0])));
		response.sendRedirect("taskparticular.jsp?count="+str[1]);
	}
//	
	//点击计划详情
	@RequestMapping("manager/lgplaninfo.do")
	public void planinfo(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			String planid = request.getParameter("radiobutton");
			System.out.println("当前pingjie的字符串"+planid);
			String[] str=planid.split("-");
			System.out.println("当前任务的计划数"+str[1]);
			request.getSession().setAttribute("planinfo", this.tasks.selectPlanById(Integer.parseInt(str[0])));
			response.sendRedirect("program.jsp?count="+str[1]);
		} catch (Exception e) {
			response.sendRedirect("error.jsp");
		}				
	}
//	
//	
	//新添任务
	@RequestMapping("manager/lgtaskinsert.do")
	public void taskinsert(@RequestParam("select") Integer impId,
			@ModelAttribute("task") TTask task,@RequestParam("task_desc") String desc,
			HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("任务描述"+desc);
		task.setTaskDesc(desc);
		task.setStatus("未实施");
		//发布人的id
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		//T_Employee emp=new T_Employee();
		//emp.setEmployee_ID(8);
		
		int count = this.tasks.insertTask(task, impId, emp.getEmployeeId().intValue());
		
		if (count>0) {
			response.sendRedirect("lgtask.do");
		}else{
			response.sendRedirect("error.jsp");
		}		
	}
//
	//删除任务
	@RequestMapping("manager/lgtaskdelete.do")
	public void taskdelete(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			String[] taskids =request.getParameterValues("radiobutton");
		int count=0;
		for (int i = 0; i < taskids.length; i++) {
			 count += this.tasks.deleteTask(Integer.parseInt(taskids[i]));
		}		
		if (count>(taskids.length-1)) {
			response.sendRedirect("lgtaskundone.do");
		}else{
			response.sendRedirect("error.jsp");
		}
		
		
	} catch (Exception e) {
		response.sendRedirect("error.jsp");
	}
	}
//	
	//跳转到修改未实施任务的页面
	@RequestMapping("manager/lgtaskupdate.do")
	public void taskup(@RequestParam("taskid") Integer taskid,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("当前传过来的taskid"+taskid);
		TEmployee emp = (TEmployee) request.getSession().getAttribute("employee");
		//T_Employee emp=new T_Employee();
		//emp.setEmployee_ID(8);
		request.getSession().setAttribute("selectTask", this.tasks.selectEmpByRarntId(emp.getEmployeeId().intValue(),1,100));
		request.getSession().setAttribute("uptask", this.tasks.selectAllTaskByID(taskid));
		response.sendRedirect("adjust.jsp");
	}
//	
	//按编号修改任务
	@RequestMapping("manager/lgtaskupdateto.do")
	public void taskupdate(@RequestParam("select") Integer impId,
			@ModelAttribute("task") TTask task,@RequestParam("taskid") Integer taskid,
			HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("任务描述"+task.getTaskDesc());
		System.out.println("任务ming"+task.getTaskName());
		System.out.println("实施人的id"+impId);
		System.out.println("任务的id"+taskid);
		task.setTaskId(new BigDecimal(taskid));
		
		int count = this.tasks.updateTask(task, impId);
		//int count=1;
		if (count>0) {
			response.sendRedirect("lgtaskundone.do");
		}else{
			response.sendRedirect("error.jsp");
		}		
	}
//	
	//查询人员详情
		@RequestMapping("manager/lgempinfo.do")
		public void empinfo(@RequestParam("radiobutton") Integer empId,
				HttpServletRequest request,HttpServletResponse response) throws IOException {
			System.out.println("当前要查询的人员id"+empId);
			request.getSession().setAttribute("empinfo", this.tasks.selectEmpById(empId));
			response.sendRedirect("personinfo.jsp");
		}
//		
//		
		//跟踪任务详细信息+计划
		@RequestMapping("manager/lgtaskdanceinfo.do")
		public void taskdanceinfo(@RequestParam("radiobutton") Integer taskid,HttpServletRequest request,HttpServletResponse response) throws IOException {
			request.getSession().setAttribute("lgtaskinfo", this.tasks.selectAllTaskByID(taskid));
			request.getSession().setAttribute("lgtask_plan", this.tasks.selectPlan(taskid));
			response.sendRedirect("programinten.jsp");
		}
		
		//修改任务的状态
		@RequestMapping("manager/lgtaskupdatestatus.do")
		public void taskupdatestatus(@RequestParam("select") String selectstr,
				HttpServletRequest request,HttpServletResponse response) throws IOException {
			String[] str=selectstr.split("-");
			System.out.println("传过来的下拉框"+selectstr);
			int count =0;
			if (str[0].equals("undone")) {
				//实施中
				count=this.tasks.updateTaskstatus(Integer.parseInt(str[1]), "实施中");
			}else if(str[0].equals("end")){
				//已完成
				count=this.tasks.updateTaskstatus(Integer.parseInt(str[1]), "已完成");
			}
			
			if (count>0) {
				response.sendRedirect("lgtaskdance.do");
			}else{
				response.sendRedirect("error.jsp");
			}		
		}
}
