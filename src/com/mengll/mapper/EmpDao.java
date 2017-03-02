package com.mengll.mapper;

import com.mengll.bean.Emp;

public interface EmpDao {
	public Emp selectEmpByEmpno(int a) throws Exception;
//	public Emp findUserById(int id) throws Exception;
//	public void insert(Emp emp) throws Exception;
//	public void delete(int id) throws Exception;
}
