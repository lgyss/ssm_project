package com.newer.datang.data.service.person.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newer.datang.data.dao.TEmployeeMapper;
import com.newer.datang.data.dao.TPlanMapper;
import com.newer.datang.data.dao.TRoleMapper;
import com.newer.datang.data.dao.TTaskMapper;
import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TPlanExample;
import com.newer.datang.data.entity.TRole;
import com.newer.datang.data.entity.TRoleExample;
import com.newer.datang.data.entity.TTask;
import com.newer.datang.data.entity.TTaskExample;
import com.newer.datang.data.entity.TTaskExample.Criteria;
import com.newer.datang.data.entity.TTaskExample.Criterion;
import com.newer.datang.data.service.person.PersonService;
import com.newer.datang.data.service.person.PlanDTO;
import com.newer.datang.data.util.DAOUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

@Service("PersonServiceImpl")
public class PersonServiceImpl implements PersonService {
	
	@Resource(name="dao")
	DAOUtil Util;
	
	//���ݽ�ɫ��ţ���ѯ��ɫ
	@Override
	public TRole roleSelect(int id) {
		TRoleMapper dao = Util.Roledao();
		return dao.selectByPrimaryKey(new BigDecimal(id));
	}

	//����Ա����ţ���ѯԱ��
	@Override
	public TEmployee personSelect(int id) {
		TEmployeeMapper dao = Util.Empdao();
		return dao.selectByPrimaryKey(new BigDecimal(id));
	}

	//���������ţ���ѯ����
	@Override
	public TTask taskSelectById(int id) {
		TTaskMapper dao = Util.Taskdao();
		TTask task = dao.selectByPrimaryKey(new BigDecimal(id));
		TEmployeeMapper empdao = Util.Empdao();
		task.setMp_emp(empdao.selectByPrimaryKey(new BigDecimal(id)));
		task.setAs_emp(empdao.selectByPrimaryKey(new BigDecimal(id)));
		return task;
	}

	//����Ա����ţ���ѯ���񣬷�ҳ
	@Override
	public List<TTask> taskSelect(int implementorId, int pageNo, int pageSize) {
		int start = (pageNo -1) * pageSize +1;
		int end = pageNo * pageSize;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("implementorId", implementorId);
		map.put("start", start);
		map.put("end", end);
		TTaskMapper dao = Util.Taskdao();
		List<TTask> taskAll = dao.selectByPage(map);
		TEmployeeMapper empdao = Util.Empdao();
		for (TTask tTask : taskAll) {
			tTask.setMp_emp(empdao.selectByPrimaryKey(new BigDecimal(implementorId)));
			tTask.setAs_emp(empdao.selectByPrimaryKey(new BigDecimal(implementorId)));
		}
		return taskAll;
	}
	
	//����Ա����ţ���ѯ��������
	@Override
	public int SelectZongShu(int id) {
		TTaskMapper dao = Util.Taskdao();
		TTaskExample example = new TTaskExample();
		example.createCriteria().andImplementorIdEqualTo(new BigDecimal(id));
		int count = dao.countByExample(example);//
		System.out.println("����������"+count);
		return count;
	}

	//���������ţ���ѯ�ƻ�
	@Override
	public List<TPlan> planSelect(int taskId) {
		TPlanMapper dao = Util.Plandao();
		TPlanExample example = new TPlanExample();
		example.createCriteria().andTaskIdEqualTo(new BigDecimal(taskId));
		return dao.selectByExample(example);
	}
	
	//�½��ƻ�
	@Override
	public int PlanInsert(TPlan plan) {
		TPlanMapper dao = Util.Plandao();
		return dao.insert(plan);
	}

	//���ݼƻ���ţ�ɾ���ƻ�
	@Override
	public int PlanDelete(int id) {
		TPlanMapper dao = Util.Plandao();
		return dao.deleteByPrimaryKey(new BigDecimal(id));
	}

	//�޸ļƻ�
	@Override
	public int planUpdate(TPlan plan) {
		TPlanMapper dao = Util.Plandao();
		return dao.updateByPrimaryKey(plan);
	}

	//���������ţ���ѯ�ƻ�����
	@Override
	public int jihuaCount(int rnwuId) {
		TPlanMapper dao = Util.Plandao();
		TPlanExample example = new TPlanExample();
		example.createCriteria().andTaskIdEqualTo(new BigDecimal(rnwuId));
		return dao.countByExample(example);
	}

	//���������ţ��޸�����״̬
	@Override
	public int StatusUpdate(String statu, int renwuId) {
		TTaskMapper dao = Util.Taskdao();
		TTask task = new TTask();
		task.setStatus(statu);
		task.setTaskId(new BigDecimal(renwuId));
		return dao.updateByPrimaryKeySelective(task);
	}

	//���ݼƻ���ţ���ѯ�ƻ�
	@Override
	public TPlan planSelectById(int id) {
		TPlanMapper dao = Util.Plandao();
		return dao.selectByPrimaryKey(new BigDecimal(id));//
	}

	//����Ա����ţ���ϲ�ѯ����ҳ
	@Override
	public List<TPlan> query(PlanDTO dto, int pageNo, int pageSize, int id) {
		int start = (pageNo -1) * pageSize +1;
		int end = pageNo * pageSize;
		TPlanMapper dao = Util.Plandao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		map.put("dto", dto);
		map.put("id", id);
		System.out.println("Map���ϣ�"+map);
		System.out.println("Map���ϣ�"+map.size());
		List<TPlan> planAll = dao.selectByPage(map);
		System.out.println(planAll.toString());
		
		TEmployee emp = new TEmployee();
		TTask task = new TTask();
		
		TTaskMapper taskdao = Util.Taskdao();
		TEmployeeMapper empdao = Util.Empdao();
		for (TPlan tPlan : planAll) {
			task.setMp_emp(empdao.selectByPrimaryKey(new BigDecimal(id)));
			tPlan.setTask(taskdao.selectByPrimaryKey(tPlan.getTaskId()));
			System.out.println("��ϲ�ѯ��"+tPlan.toString());
		}
		return planAll;
	}

	//����Ա���ı�ţ���ѯ�ƻ�����
	@Override
	public int Count(PlanDTO dto, int id) {
		TPlanMapper dao = Util.Plandao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dto", dto);
		map.put("id", id);
		int JiHuaCount = dao.selectCount(map);//@
		return JiHuaCount;
	}

	//�û���¼
	@Override
	public TEmployee checkLogin(String employeeName, String password) {
		TEmployeeMapper dao = Util.Empdao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", employeeName);
		map.put("pass", password);
		TEmployee empUser = dao.Emplogin(map);
		TRoleMapper daorole = Util.Roledao();
		empUser.setRole(daorole.selectByPrimaryKey(empUser.getRoleId()));
		return empUser;
	}

	@Test
	public void test(){
		TPlanMapper dao = Util.Plandao();
		Map<String, Object> map = new HashMap<String, Object>();
		//map.put("dto", dto);
		map.put("start", 1);
		map.put("end",2);
		map.put("id", new BigDecimal(7));
		List<TPlan> planAll = dao.selectByPage(map);//
		System.err.println("��ѯ�����"+planAll.size());
		
	}

}
