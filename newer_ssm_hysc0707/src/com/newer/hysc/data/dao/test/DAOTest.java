package com.newer.hysc.data.dao.test;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.newer.hysc.data.dao.UploadtempMapper;
import com.newer.hysc.data.entity.Uploadtemp;
import com.newer.hysc.data.entity.UploadtempExample;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DAOTest extends SqlSessionDaoSupport {
	@Resource(name="sqlSessionFactory")
	SqlSessionFactory sqlSessionFactory;
	
	SqlSession session=null;
	
	@PostConstruct
    private void initialize() {
        setSqlSessionFactory(sqlSessionFactory);        
        session=super.getSqlSession();
        System.out.println("获得链接："+session);
    }
	
	@Test
	public void main() {
		//System.out.println("wdwwwwwwwwwww");
		UploadtempMapper upload=this.session.getMapper(UploadtempMapper.class);
		//System.out.println(upload.selectByExample(new UploadtempExample()));
		for (Uploadtemp up : upload.selectByExample(new UploadtempExample())) {
			System.out.println("当前对象：");
			System.out.println(up.getUploader());
			System.out.println(up.getUploadfilepath());
		}
	}
}
