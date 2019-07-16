package com.covalese.springcore.bean;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanempconfig.xml");
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("beanempconfig.xml");
		EmployeeBean empbean1 = (EmployeeBean) applicationContext.getBean("employeeBean1");
		Scanner scan = new Scanner(System.in);
		log.info("Enter Employee id: ");
		empbean1.setId(scan.nextInt());
		scan.nextLine();
		log.info("Enter Employee Name: ");
		empbean1.setName(scan.nextLine());

		EmployeeBean empbean2 = (EmployeeBean) applicationContext.getBean("employeeBean1");

		log.info("Enter Employee id1: ");
		empbean2.setId(scan.nextInt());
		scan.nextLine();
		log.info("Enter Employee Name1: ");
		empbean2.setName(scan.nextLine());

		/*
		 * log.info("id " + empbean1.getId()); log.info(empbean1.getName());
		 * log.info("name " + empbean2.getId()); log.info(empbean2.getName());
		 */

		log.info("employee1" + empbean1);
		log.info("employee2" + empbean2);

		((AbstractApplicationContext) applicationContext).close();
		// ((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
