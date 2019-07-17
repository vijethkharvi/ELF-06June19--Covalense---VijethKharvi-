package com.covalense.springcore.annotation;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalese.springcore.bean.DepartmentBean;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);

		log.info("Employee name: " + employeeBean.getName());
		log.info("Employee id: " + employeeBean.getId());

		DepartmentBean deptBean = employeeBean.getDepartmentBean();

		log.info("Dept id: " + deptBean.getDeptId());
		log.info("Dept name: " + deptBean.getDeptName());

		((AbstractApplicationContext) applicationContext).close();

	}
}
