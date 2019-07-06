package com.covalense.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
/**
 * Hello world!
 *
 */
public class DesignPatterTest {

	public static void main(String[] args) {
		// EmployeeDAOJDBCImpl dao = new EmployeeDAOJDBCImpl();
		// EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1001));
		printInfo(dao.getEmployeeInfo("1002"));

		/*
		 * ArrayList<EmployyeBeanJava> beans = dao.getAllEmployeeInfo(); for
		 * (EmployyeBeanJava bean : beans) { printInfo(bean); }
		 */
		// create an employee info
		EmployyeBeanJava empinf = new EmployyeBeanJava();
		empinf.setId(2000);
		empinf.setName("manganna");
		empinf.setAge(31);
		empinf.setGender("female");
		empinf.setSalary(9000);
		empinf.setPhone(919678013212L);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = format.parse("2019-10-10");
			empinf.setJoiningDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empinf.setAccno(10003995345676L);
		empinf.setEmail("inana@gmail.com");
		empinf.setDesignation("singer");
		Date date2;
		try {
			date2 = format.parse("1991-10-10");
			empinf.setDob(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empinf.setDepartmentId(6);
		empinf.setManagerId(21);

		log.info("inserted the employee info? ans:" + dao.createEmployeeInfo(empinf));
		log.info("deleted employee info ans:"+dao.deleteEmployeeInfo(2000));
	}// end of main

	private static void printInfo(EmployyeBeanJava bean) {
		log.info("employee id is " + bean.getId());
		log.info("employee name is " + bean.getName());
		log.info("employee age is " + bean.getAge());
		log.info("employee gender is " + bean.getGender());
		log.info("employee salary is " + bean.getSalary());
		log.info("employee phone is " + bean.getPhone());
		log.info("employee joining_date is " + bean.getJoiningDate());
		log.info("employee acount_number is " + bean.getAccno());
		log.info("employee email is " + bean.getEmail());
		log.info("employee designation is " + bean.getDesignation());
		log.info("employee dob is " + bean.getDob());
		log.info("employee Dept_id is " + bean.getDepartmentId());
		log.info("employee manager_id is " + bean.getManagerId());
	}
}// end of class
