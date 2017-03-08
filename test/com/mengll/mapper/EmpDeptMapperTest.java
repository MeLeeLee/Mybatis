package com.mengll.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mengll.bean.Emp;

public class EmpDeptMapperTest {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

	}

	@Test
	public void testFindEmpDept() throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		EmpDeptMapper deptMapper=sqlSession.getMapper(EmpDeptMapper.class);
		List<Emp> list=deptMapper.findEmpDept();
		System.out.println(list.size());
		sqlSession.close();
	}

}
