package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.covalese.springcore.bean.DepartmentBean;

public class DeptConfig {
	@Bean(name="CEO")
	public DepartmentBean getDepartmentBeanCEO() {
		DepartmentBean deptbean = new DepartmentBean();
		deptbean.setDeptId(104);
		deptbean.setDeptName("CEO");

		return deptbean;

	}
	@Bean(name="IT")
	public DepartmentBean getDepartmentBeanIT() {
		DepartmentBean deptbean = new DepartmentBean();
		deptbean.setDeptId(105);
		deptbean.setDeptName("IT");

		return deptbean;

	}

}
