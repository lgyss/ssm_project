package com.newer.datang.data.service.manager;

import java.util.List;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TTask;

public interface TaskService {
	
	//��ѯ��������
	public List<TTask> allTask(TEmployee emp,int pageNo, int pageSize,String status);
	
	//��id�鵥������
	public TTask selectAllTaskByID(int taskid);
	
	//���������id�鵽�������������ļƻ�
	public List<TPlan> selectPlan(int taskid);
	
	//���ݵ����ƻ�id���ҵ��ƻ���ϸ��Ϣ
	public TPlan selectPlanById(int planid);
	
	//��ѯ����Ա������������
	public List<TEmployee> selectEmpByRarntId(int rarntid,int pageNo, int pageSize);
	
	//��������
	public int insertTask(TTask task,int impID,int assId);
	
	//ɾ������
	public int deleteTask(int taskid);
	
	//������޸�����
	public int updateTask(TTask task,int impid);
	
	//����Ų�ѯ��Ա��ϸ��Ϣ
	public TEmployee selectEmpById(int empid);
	
	//�޸�����״̬
	public int updateTaskstatus(int empid, String status);
}
