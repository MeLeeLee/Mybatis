package com.mengll.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mengll.bean.Emp;

public class EmpDaoImpl implements EmpDao{
	private SqlSessionFactory sqlSessionFactory;
	public EmpDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory=sqlSessionFactory;
	}
	public Emp findUserById(int id) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		Emp emp=sqlSession.selectOne("test.selectEmpByEmpno", id);
		sqlSession.close();
		return emp;
	}
	public void insert(Emp emp) throws Exception {
		
	}
	public void delete(int id) throws Exception {
		
	}

}
