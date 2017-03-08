package com.mengll.mapper;

import static org.junit.Assert.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mengll.bean.Dept;

public class DeptTest {
	private SqlSessionFactory factory;
	@Before
	public void set() throws Exception{
		factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
	}
	@Test
	public void testFindDeptByDeptNo() throws Exception{
		SqlSession sqlSession=factory.openSession();
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		Dept dept=new Dept();
		dept.setDeptNo(20);
		Dept dept1=deptMapper.findDeptByDeptNo(dept);
		System.out.println(dept1.getdName());
		sqlSession.close();
	}

}
