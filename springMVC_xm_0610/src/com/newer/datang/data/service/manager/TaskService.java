package com.newer.datang.data.service.manager;

import java.util.List;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TTask;

public interface TaskService {
	
	//查询所有任务
	public List<TTask> allTask(TEmployee emp,int pageNo, int pageSize,String status);
	
	//按id查单个任务
	public TTask selectAllTaskByID(int taskid);
	
	//根据任务的id查到它下面所创建的计划
	public List<TPlan> selectPlan(int taskid);
	
	//根据单条计划id查找到计划详细信息
	public TPlan selectPlanById(int planid);
	
	//查询手下员工放入下拉框
	public List<TEmployee> selectEmpByRarntId(int rarntid,int pageNo, int pageSize);
	
	//发布任务
	public int insertTask(TTask task,int impID,int assId);
	
	//删除任务
	public int deleteTask(int taskid);
	
	//按编号修改任务
	public int updateTask(TTask task,int impid);
	
	//按编号查询人员详细信息
	public TEmployee selectEmpById(int empid);
	
	//修改任务状态
	public int updateTaskstatus(int empid, String status);
}
