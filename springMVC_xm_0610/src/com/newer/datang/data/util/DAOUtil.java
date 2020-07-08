package com.newer.datang.data.util;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.newer.datang.data.dao.TEmployeeMapper;
import com.newer.datang.data.dao.TPlanMapper;
import com.newer.datang.data.dao.TRoleMapper;
import com.newer.datang.data.dao.TTaskMapper;

public class DAOUtil extends SqlSessionDaoSupport {
	
	
	@Resource(name="sqlSessionFactory")
	SqlSessionFactory sqlSessionFactory;
	
	SqlSession session=null;
	
	@PostConstruct
    private void initialize() {
        setSqlSessionFactory(sqlSessionFactory);        
        session=super.getSqlSession();
        System.out.println("ªÒµ√¡¥Ω”£∫"+session);
    }
	
	public TTaskMapper Taskdao() {
		return session.getMapper(TTaskMapper.class);
	}

	public TEmployeeMapper Empdao() {
		return session.getMapper(TEmployeeMapper.class);
	}

	public TPlanMapper Plandao() {
		return session.getMapper(TPlanMapper.class);
	}

	public TRoleMapper Roledao() {
		return session.getMapper(TRoleMapper.class);
	}
}
