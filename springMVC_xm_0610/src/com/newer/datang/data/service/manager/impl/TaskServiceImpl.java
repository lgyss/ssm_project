package com.newer.datang.data.service.manager.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.newer.datang.data.dao.TEmployeeMapper;
import com.newer.datang.data.dao.TPlanMapper;
import com.newer.datang.data.dao.TRoleMapper;
import com.newer.datang.data.dao.TTaskMapper;
import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.service.manager.TaskService;
import com.newer.datang.data.util.DAOUtil;

@Service("taskservice")
public class TaskServiceImpl extends SqlSessionDaoSupport implements TaskService {

	DAOUtil dao=new DAOUtil();
	
	@Override
	public List<TTask> allTask(TEmployee emp, int pageNo, int pageSize,
			String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TTask selectAllTaskByID(int taskid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TPlan> selectPlan(int taskid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPlan selectPlanById(int planid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TEmployee> selectEmpByRarntId(int rarntid, int pageNo,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTask(TTask task, int impID, int assId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTask(int taskid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTask(TTask task, int impid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TEmployee selectEmpById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTaskstatus(int empid, String status) {
		// TODO Auto-generated method stub
		return 0;
	}

}
