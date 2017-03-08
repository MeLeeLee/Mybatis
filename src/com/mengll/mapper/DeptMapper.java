package com.mengll.mapper;

import com.mengll.bean.Dept;

public interface DeptMapper {
	public Dept findDeptByDeptNo(Dept dept) throws Exception;
}
