package com.covalese.springcore.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class EmployeeBean implements InitializingBean, DisposableBean {
	private String name;
	private int id;
	private DepartmentBean departmentBean;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initailization phase");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy phase");
	}

}
