package com.newer.datang.data.service.manager.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;


import java.util.Map;

import javax.annotation.Resource;








import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TPlanExample;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.entity.TTaskExample;
import com.newer.datang.data.service.manager.TaskService;
import com.newer.datang.data.util.DAOUtil;

@Service("taskservice")
public class TaskServiceImpl implements TaskService {

	@Resource(name="dao")
	DAOUtil dao;
	
	@Override
	public List<TTask> allTask(TEmployee emp, int pageNo, int pageSize,
			String status) {
		int start = (pageNo -1) * pageSize +1;
		int end = pageNo * pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("eid", emp.getEmployeeId());
		map.put("start", start);
		map.put("end", end);
		map.put("status", status);
		// TODO Auto-generated method stub
		List<TTask> allTask=dao.Taskdao().selectByPage(map);
		for (TTask tTask : allTask) {
			TPlanExample exmp=new TPlanExample();
			exmp.createCriteria().andTaskIdEqualTo(tTask.getTaskId());
			TEmployeeExample exmp1=new TEmployeeExample();
			exmp1.createCriteria().andEmployeeIdEqualTo(tTask.getImplementorId());
			tTask.setMp_emp(dao.Empdao().selectByExample(exmp1).get(0));
			tTask.setTaskDesc(Integer.toString(dao.Plandao().countByExample(exmp)));
		}
		return allTask;
	}

	@Override
	public TTask selectAllTaskByID(int taskid) {
		TTaskExample taske=new TTaskExample();
		taske.createCriteria().andTaskIdEqualTo(new BigDecimal(taskid));
		List<TTask> allTask=dao.Taskdao().selectByExample(taske);
		for (TTask tTask : allTask) {
			TEmployeeExample exmp1=new TEmployeeExample();
			exmp1.createCriteria().andEmployeeIdEqualTo(tTask.getImplementorId());
			tTask.setMp_emp(dao.Empdao().selectByExample(exmp1).get(0));
		}
		return allTask.get(0);
	}

	@Override
	public List<TPlan> selectPlan(int taskid) {
		TPlanExample exmp=new TPlanExample();
		exmp.createCriteria().andTaskIdEqualTo(new BigDecimal(taskid));
		List<TPlan> list=dao.Plandao().selectByExample(exmp);
		
		return list;
	}

	@Override
	public TPlan selectPlanById(int planid) {
		TPlanExample exmp=new TPlanExample();
		exmp.createCriteria().andPlanIdEqualTo(new BigDecimal(planid));
		List<TPlan> list=dao.Plandao().selectByExample(exmp);
		for (TPlan tPlan : list) {
			TTaskExample taske=new TTaskExample();
			taske.createCriteria().andTaskIdEqualTo(tPlan.getTaskId());
			List<TTask> ChildTask=dao.Taskdao().selectByExample(taske);
			System.out.println("所属任务名："+ChildTask.get(0).getTaskName());
			tPlan.setTask(ChildTask.get(0));
		}
		return list.get(0);
	}

	@Override
	public List<TEmployee> selectEmpByRarntId(int rarntid, int pageNo,
			int pageSize) {
		int start = (pageNo -1) * pageSize +1;
		int end = pageNo * pageSize;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rarntid", rarntid);
		map.put("start", start);
		map.put("end", end);		
		// TODO Auto-generated method stub
		return dao.Empdao().selectEmpByRarntId(map);
	}

	@Override
	public int insertTask(TTask task, int impID, int assId) {
		task.setImplementorId(new BigDecimal(impID));
		task.setAssignerId(new BigDecimal(assId));	
		return dao.Taskdao().insert(task);
	}

	@Override
	public int deleteTask(int taskid) {		
		return dao.Taskdao().deleteByPrimaryKey(new BigDecimal(taskid));
	}

	@Override
	public int updateTask(TTask task, int impid) {
		task.setImplementorId(new BigDecimal(impid));
		task.setStatus("未实施");
		return dao.Taskdao().updateByPrimaryKeySelective(task);
	}

	@Override
	public TEmployee selectEmpById(int empid) {
		
		return dao.Empdao().selectByPrimaryKey(new BigDecimal(empid));
	}

	@Override
	public int updateTaskstatus(int empid, String status) {
		TTask task=new TTask();
		task.setTaskId(new BigDecimal(empid));
		task.setStatus(status);
		return dao.Taskdao().updateByPrimaryKeySelective(task);
	}

}
