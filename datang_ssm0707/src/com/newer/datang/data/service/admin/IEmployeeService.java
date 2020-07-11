package com.newer.datang.data.service.admin;

import java.util.List;
import java.util.Map;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TRole;


public interface IEmployeeService {
	//ȫ����ѯ
	public abstract List<TEmployee> selectEmployees(TEmployeeExample employee);
	//���Ա��
    public abstract int insertEmployee(TEmployee employee);
    //�����ɾ��һ��Ա��
    public abstract int deleteEmployee(int  employee);
    //������޸�һ��Ա��
  	public abstract int modifyEmployee(TEmployee employee);
  	//��ҳ
  	public List<TEmployee> selectByPage(Map<String, Object> param);
    //��ȡ����
  	public int getTotalCount(TEmployeeExample example);
  	//��ѯ��ɫ
  	public abstract List<TRole> findAllRoles();
  	//����Ų�ѯԱ��
  	public  TEmployee findEmployeeById(Integer id);
  	//��ѯ��������
    public abstract List<TEmployee> queryAllManager(TEmployee id);
}
