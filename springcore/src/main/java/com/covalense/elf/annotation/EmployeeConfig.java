package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalese.springcore.bean.DepartmentBean;
@Configuration
@Import(DeptConfig.class)
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean empbean = new EmployeeBean();
		empbean.setId(101);
		empbean.setName("prajwal");

		return empbean;

	}

}
