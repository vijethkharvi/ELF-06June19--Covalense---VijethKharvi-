package com.covalense.springcore.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalese.springcore.bean.DepartmentBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class EmployeeBean implements InitializingBean, DisposableBean {
	private String name;
	private int id;
	
	@Autowired
	@Qualifier("CEO")
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
