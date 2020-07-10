package com.newer.datang.data.service.person;

import java.util.List;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TRole;
import com.newer.datang.data.entity.TTask;

public interface PersonService {

		//��ѯ�û�һ����¼
		public abstract TRole roleSelect(int id);
		
		//��ѯԱ��һ����¼
		public abstract TEmployee personSelect(int id);

		//��ѯ�����һ����¼
		public abstract TTask taskSelectById(int id);

		//����Ա���ı�Ų�ѯȫ������
		public abstract List<TTask> taskSelect(int implementorId,int pageNo, int pageSize);

		//����Ա������ı�Ų�ѯ���¼ƻ�
		public abstract List<TPlan> planSelect(int taskId);

		//�½��ƻ�
		public abstract int PlanInsert(TPlan plan);

		//ɾ���ƻ�
		public abstract int PlanDelete(int id);

		//�޸ļƻ�
		public abstract int planUpdate(TPlan plan);
		
		//���������Ų�ѯ�ƻ�����
		public abstract int jihuaCount(int rnwuId);
		
		//�޸�����״̬
		public abstract int StatusUpdate(String statu,int renwuId);
		
		//��ѯ�ƻ���һ����¼
		public abstract TPlan planSelectById(int id);
		
		//�ƻ���ϲ�ѯ
		public abstract List<TPlan> query(PlanDTO dto,int pageNo,int pageSize,int id);
			
		//��ȡ������
		public abstract int Count(PlanDTO dto,int id);
		
		//��¼��ѯ
		public abstract TEmployee checkLogin(String employeeName, String password);
		
		//��ȡ������
		public abstract int SelectZongShu(int id);
}
