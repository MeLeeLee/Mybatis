package com.mengll.dao;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mengll.bean.Emp;

public class EmpDaoImplTest {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void set() throws Exception {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
	}

	@Test
	public void testFindUserById() throws Exception{
		EmpDao empDao=new EmpDaoImpl(sqlSessionFactory);
		Emp emp=empDao.findUserById(7499);
		System.out.println(emp.getSal());
	}

}
