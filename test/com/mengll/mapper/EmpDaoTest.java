package com.mengll.mapper;

import static org.junit.Assert.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mengll.bean.Emp;


public class EmpDaoTest {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void set() throws Exception {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
	}
	@Test
	public void test() throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		EmpDao empDao=sqlSession.getMapper(EmpDao.class);
		Emp emp=empDao.selectEmpByEmpno(7499);
		System.out.println(emp.getJob());
		sqlSession.close();
	}

}
