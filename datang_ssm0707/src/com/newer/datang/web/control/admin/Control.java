package com.newer.datang.web.control.admin;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.management.relation.Role;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TRole;
import com.newer.datang.data.entity.TRoleExample;
import com.newer.datang.data.service.admin.IEmployeeService;
import com.newer.datang.data.util.DAOUtil;
import com.newer.datang.data.util.EmployeeForm;
import com.newer.datang.data.util.PageBean;

@Controller
public class Control {
	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

	@Resource(name="dao")
	DAOUtil dao;
	
	
	@Resource(name = "IEmployeeServiceimpl")
	IEmployeeService service;

	// ��ҳ����empadmin.jsp
	@RequestMapping("admin/All.do")
	public void page(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws IOException {
		int pageNo = 1;
		int pageSize = 3;
		if (!isBlank(request.getParameter("pageNo")))
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		if (!isBlank(request.getParameter("pageSize")))
			pageSize = Integer.parseInt(request.getParameter("pageSize"));
		
		List<Integer> integerscount=new ArrayList<Integer>();
	    integerscount.add(4);
	    Map<String, Object> paramcount = new HashMap<String, Object>();
	    paramcount.put("roleId",integerscount);
	    paramcount.put("startIndex", 1);
	    paramcount.put("endIndex", 100);	
	    int count= service.selectByPage(paramcount).size();
		
		System.out.println("����" + count);
		 List<Integer> integers=new ArrayList<Integer>();
		    integers.add(4);
		Map<String, Object> param = new HashMap<String, Object>();
		int start = (pageNo - 1) * pageSize + 1;
		int end = pageNo * pageSize;
		param.put("roleId",integers);
		param.put("startIndex", start);
		param.put("endIndex", end);
		
		List<TEmployee> data = service.selectByPage(param);
		for (TEmployee tEmployee : data) {
		    tEmployee.setRole(dao.Roledao().selectByPrimaryKey(tEmployee.getRoleId()));
			}
		PageBean<TEmployee> pb = new PageBean<TEmployee>();
		pb.setData(data);
		pb.setPageNo(pageNo);
		pb.setPageSize(pageSize);
		pb.setTotalRecords(count);
		
		
		session.setAttribute("empadmin", pb);
		System.out.println("��ҳ����" + pb.toString());
		response.sendRedirect("../admin/empadmin.jsp");
	}

	// ɾ��Ա��
	@RequestMapping("admin/delete.do")
	public String deleteEmployee(Integer ID, String empRoleName,
			String empName, HttpServletResponse response, HttpSession session)
			throws IOException {

		if ("Ա��".equals(empRoleName)) {
			this.service.deleteEmployee(ID);
		} else {
			this.service.deleteEmployee(ID);	
		}
		return "All.do";
	}

	// ��ҳ����useradmin.jsp
	@RequestMapping("admin/queryall.do")
	public String query(HttpSession session, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		int pageNo = 1;
		int pageSize = 3;
		if (!isBlank(request.getParameter("pageNo")))
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		if (!isBlank(request.getParameter("pageSize")))
			pageSize = Integer.parseInt(request.getParameter("pageSize"));
		List<Integer> integerscount=new ArrayList<Integer>();
	    integerscount.add(4);
	    integerscount.add(3);
	    Map<String, Object> paramcount = new HashMap<String, Object>();
	    paramcount.put("roleId",integerscount);
	    paramcount.put("startIndex", 1);
	    paramcount.put("endIndex", 100);	
	    int count= service.selectByPage(paramcount).size();
		System.out.println("����" + count);
	    List<Integer> integers=new ArrayList<Integer>();
	    integers.add(3);
	    integers.add(4);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("count", count);
		int start = (pageNo - 1) * pageSize + 1;
		int end = pageNo * pageSize;
		param.put("startIndex", start);
		param.put("endIndex", end);
		param.put("roleId", integers);
	
		List<TEmployee> data = service.selectByPage(param);
		for (TEmployee tEmployee : data) {
	    tEmployee.setRole(dao.Roledao().selectByPrimaryKey(tEmployee.getRoleId()));
		}
		
		
		PageBean<TEmployee> pb = new PageBean<TEmployee>();
		pb.setData(data);
		pb.setPageNo(pageNo);
		pb.setPageSize(pageSize);
		pb.setTotalRecords(count);
		session.setAttribute("emps", pb);
		System.out.println("��ҳ����" + pb.toString());
		return "redirect:/admin/useradmin.jsp";
	}

	// װ��Ա������������
	@RequestMapping("admin/personadd.do")
	public String personadd(Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session)
			throws IOException {

		// �հױ�����
		EmployeeForm addForm = new EmployeeForm();
		addForm.setEmp(new TEmployee());
		addForm.setRole(new TRole());
		addForm.setConfirmPassword("");
		System.out.println("123" + new TRole().toString());
		List<TRole> list = this.service.findAllRoles();
		model.addAttribute("addForm", addForm);
		model.addAttribute("allAddRoles", list);// ����������ɫ�����б�װ������
		return "forward:personadd.jsp";
	}

	// ���Ա��
	@RequestMapping("admin/emp_add.do")
	public String addEmployee(@ModelAttribute("addForm") EmployeeForm addForm,
			Model model, HttpServletResponse response, HttpSession session)
			throws IOException {
		TEmployee emp = addForm.getEmp();
		String password = emp.getPassword();
		System.out.println("addFor������"+addForm.toString());
		if (addForm.getConfirmPassword().equals(password)) {
			service.insertEmployee(emp);
			return "redirect:/admin/queryall.do";
		}else {
			// �������벻һ�´���
			// ����Χ�洢ʧ�ܵ�message
			model.addAttribute("message", "����ʧ�ܣ��������벻һ��");
			return "error.jsp";// ��ת��error.jsp��ʾ����ʧ����Ϣ
		}
		
	}
	      
	
	     //��ѯ���н�ɫΪԱ������Ϣ
			@RequestMapping("admin/update.do")
			public String loader_update(HttpSession session, Model model,
					HttpServletRequest request, HttpServletResponse response){
				int pageNo = 1;
				int pageSize = 3;
				if (!isBlank(request.getParameter("pageNo")))
					pageNo = Integer.parseInt(request.getParameter("pageNo"));
				if (!isBlank(request.getParameter("pageSize")))
					pageSize = Integer.parseInt(request.getParameter("pageSize"));
				List<Integer> integerscount=new ArrayList<Integer>();
			    integerscount.add(4);
			    Map<String, Object> paramcount = new HashMap<String, Object>();
			    paramcount.put("roleId",integerscount);
			    paramcount.put("startIndex", 1);
			    paramcount.put("endIndex", 100);	
			    int count= service.selectByPage(paramcount).size();
				System.out.println("����" + count);
				 List<Integer> integers=new ArrayList<Integer>();
				   
				    integers.add(4);
				
				
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("count", count);
				int start = (pageNo - 1) * pageSize + 1;
				int end = pageNo * pageSize;
				param.put("roleId",integers);
				param.put("startIndex", start);
				param.put("endIndex", end);
				List<TEmployee> data = service.selectByPage(param);
				for (TEmployee tEmployee : data) {
				    tEmployee.setRole(dao.Roledao().selectByPrimaryKey(tEmployee.getRoleId()));
					}
				PageBean<TEmployee> pb = new PageBean<TEmployee>();
				pb.setData(data);
				pb.setPageNo(pageNo);
				pb.setPageSize(pageSize);
				pb.setTotalRecords(count);
				session.setAttribute("all", pb);
				System.out.println("��ҳ����" + pb.toString());
				return "redirect:/admin/empdistribute.jsp";
				
			}
			
			  //�鿴����
	        @RequestMapping("admin/persondesc.do")
	        public String desc(@RequestParam(value="ID") Integer id  ,Model model,HttpServletRequest request, HttpServletResponse response,HttpSession session){
	        	 TEmployee  employee=service.findEmployeeById(id);
	        	 employee.setRole(dao.Roledao().selectByPrimaryKey(employee.getRoleId()));
	        	 System.out.println("Ա�������"+id);
	        	 System.out.println("Ա��Ϊ"+employee.toString());
	        	 TEmployee emp=new TEmployee();
	        	 emp.setRoleId(new BigDecimal(3));
	        	  List<TEmployee>  employee2=service.queryAllManager(emp);
	        	
	        	  System.out.println("����"+employee2.toString());
	        	 
	        	 //���ÿ��������ֵ
	        	 model.addAttribute("empall", employee2);
	        	
	        	 //���ÿ��Ա����ֵ
	        	 model.addAttribute("all", employee);
	        	 session.setAttribute("person", employee);
	   		     return "forward:/admin/persondesc.jsp";
	             
	        
	        }
	      //�޸�
	        @RequestMapping(value="admin/myupdate.do",method=RequestMethod.POST)
	     	public void Myupdate(HttpSession session ,@RequestParam(value="managerid") Integer id  ,Model model, HttpServletResponse response) throws IOException{
	        	
	        	TEmployee employee=(TEmployee) session.getAttribute("person");
	        	
	        	TEmployee employee2=new TEmployee();
	        	employee2.setEmployeeId(new BigDecimal(id));
	        	service.modifyEmployee(employee);
	        	
	        	response.sendRedirect("All.do");
	        	
	        }
	        
}
