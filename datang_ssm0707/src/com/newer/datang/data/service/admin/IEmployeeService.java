package com.newer.datang.data.service.admin;

import java.util.List;
import java.util.Map;

import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TRole;


public interface IEmployeeService {
	//全部查询
	public abstract List<TEmployee> selectEmployees(TEmployeeExample employee);
	//添加员工
    public abstract int insertEmployee(TEmployee employee);
    //按编号删除一个员工
    public abstract int deleteEmployee(int  employee);
    //按编号修改一个员工
  	public abstract int modifyEmployee(TEmployee employee);
  	//分页
  	public List<TEmployee> selectByPage(Map<String, Object> param);
    //获取条数
  	public int getTotalCount(TEmployeeExample example);
  	//查询角色
  	public abstract List<TRole> findAllRoles();
  	//按编号查询员工
  	public  TEmployee findEmployeeById(Integer id);
  	//查询所有主管
    public abstract List<TEmployee> queryAllManager(TEmployee id);
}
