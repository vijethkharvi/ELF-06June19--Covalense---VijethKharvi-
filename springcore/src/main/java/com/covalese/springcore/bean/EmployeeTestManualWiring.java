package com.covalese.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Data;
import lombok.extern.java.Log;

@Log
public class EmployeeTestManualWiring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanempconfig.xml");
		EmployeeBean empbean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		log.info("employee id " + empbean1.getId());
		log.info("employee name " + empbean1.getName());

		log.info("department id " + empbean1.getDepartmentBean().getDeptId());

		log.info("department name " + empbean1.getDepartmentBean().getDeptName());

	}

}
