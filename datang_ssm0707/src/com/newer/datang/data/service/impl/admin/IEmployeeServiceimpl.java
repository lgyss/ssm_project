package com.newer.datang.data.service.impl.admin;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.newer.datang.data.dao.TEmployeeMapper;
import com.newer.datang.data.entity.TEmployee;
import com.newer.datang.data.entity.TEmployeeExample;
import com.newer.datang.data.entity.TRole;
import com.newer.datang.data.entity.TRoleExample;
import com.newer.datang.data.service.admin.IEmployeeService;
import com.newer.datang.data.util.DAOUtil;


@Service("IEmployeeServiceimpl")
public class IEmployeeServiceimpl implements IEmployeeService {

	@Resource(name="dao")
	DAOUtil dao;

	//ȫ����ѯ
	@Override
	public List<TEmployee> selectEmployees(TEmployeeExample example) {
		
		return this.dao.Empdao().selectByExample(example);
	}
   //����
	@Override
	public int insertEmployee(TEmployee employee) {
		return this.dao.Empdao().insert(employee);
	}
   //ɾ��
	@Override
	public int deleteEmployee(int  employeeId) {
		return this.dao.Empdao().deleteByPrimaryKey(new BigDecimal(employeeId));
	}
    //�޸�
	@Override
	public int modifyEmployee(TEmployee employee) {
		// TODO Auto-generated method stub
		return this.dao.Empdao().updateByPrimaryKey(employee);
	}
	//��ҳ
	@Override
	public List<TEmployee> selectByPage(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return this.dao.Empdao().selectbypage(param);
	}
	//��ȡ����
	@Override
	public int getTotalCount(TEmployeeExample example) {
		// TODO Auto-generated method stub
		return this.dao.Empdao().countByExample(example);
	}
	//��ѯ
	@Override
	public List<TRole> findAllRoles() {
		// TODO Auto-generated method stub
		return this.dao.Roledao().selectByExample(new TRoleExample());
	}
	//����id��ѯ
	@Override
	public TEmployee findEmployeeById(Integer id) {
		
		return this.dao.Empdao().selectByPrimaryKey(new BigDecimal(id));
	}
	//��ѯ����
	@Override
	public List<TEmployee> queryAllManager(TEmployee id) {
		// TODO Auto-generated method stub
		return  this.dao.Empdao().queryAllManager(id);
	}


  

}
