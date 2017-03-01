package com.mengll.dao;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mengll.bean.Emp;

public class MybatisTest {

	public static void main(String[] args) {
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));
			SqlSession sqlSession=sqlSessionFactory.openSession();
			Emp emp=sqlSession.selectOne("test.selectEmpByEmpno",7499);
			List<Emp> list=sqlSession.selectList("test.selectEmpByName", "a");
			emp.setEmpno(123);
			emp.setHiredate(new Date());
			sqlSession.insert("test.insertEmp", emp);
			System.out.println(list.size());
			System.out.println(emp.getJob());
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
