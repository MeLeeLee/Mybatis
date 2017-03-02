package com.mengll.dao;

import com.mengll.bean.Emp;

public interface EmpDao {
	public Emp findUserById(int id) throws Exception;
	public void insert(Emp emp) throws Exception;
	public void delete(int id) throws Exception;
}
