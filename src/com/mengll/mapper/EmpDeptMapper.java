package com.mengll.mapper;

import java.util.List;

import com.mengll.bean.Emp;

public interface EmpDeptMapper {
	public List<Emp> findEmpDept() throws Exception;
}
