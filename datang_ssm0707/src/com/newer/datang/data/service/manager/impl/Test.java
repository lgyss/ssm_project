package com.newer.datang.data.service.manager.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.entity.TTaskExample;
import com.newer.datang.data.service.manager.TaskService;
import com.newer.datang.data.util.DAOUtil;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
	
	@Resource(name="dao")
	DAOUtil dao;
	@Resource(name="taskservice")
	TaskService service;
	
	@org.junit.Test
	public void name() {
		//ApplicationContext app=new ClassPathXmlApplicationContext("spring-mvc.xml");
		
		System.out.println("ddd");
		TEmployee emp=new TEmployee();
		emp.setEmployeeId(new BigDecimal(47));
		List<TTask> list=service.allTask(emp, 1, 4, "");
		for (TTask tTask : list) {
			System.out.println(tTask.getTaskName()+"计划数"+tTask.getTaskDesc()+"实施人："+tTask.getMp_emp().getEmployeeName());
		}
		
	}
}
