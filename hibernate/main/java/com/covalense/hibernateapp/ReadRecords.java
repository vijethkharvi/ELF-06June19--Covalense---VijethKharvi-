package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.javaapp.covalense.bean.dto.EmployeeInfo;

import lombok.extern.java.Log;

@Log
public class ReadRecords {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfo empinfo = session.get(EmployeeInfo.class, 1001);
		log.info("employee id is " + empinfo.getId());
		log.info("employee name is " + empinfo.getName());
		log.info("employee age is " + empinfo.getAge());
		log.info("employee gender is " + empinfo.getGender());
		log.info("employee salary is " + empinfo.getSalary());
		log.info("employee phone is " + empinfo.getPhone());
		log.info("employee joining_date is " + empinfo.getJoiningDate());
		log.info("employee acount_number is " + empinfo.getAccno());
		log.info("employee email is " + empinfo.getEmail());
		log.info("employee designation is " + empinfo.getDesignation());
		log.info("employee dob is " + empinfo.getDob());
		log.info("employee Dept_id is " + empinfo.getDeptid());
		log.info("employee manager_id is " + empinfo.getMngrid());

		session.close();

	}
}
