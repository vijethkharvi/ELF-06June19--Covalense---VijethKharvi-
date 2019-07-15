package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.bean.util.HibernateUtil;
import com.covalense.javaapp.covalense.bean.dto.EmployyeBeanJava;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployyeBeanJava.class);

		Session session = factory.openSession();
		String hql = "select * from EmployeeInfo";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		for (String empName : ename) {
			log.info("name " + empName);
			/*
			 * String hql = "from EmployeeInfo"; Query query = session.createQuery(hql);
			 * List<EmployeeInfo> employeeInfobeans = query.list(); for (EmployeeInfo
			 * employeeInfo : employeeInfobeans) { log.info("Id=" + employeeInfo.getId());
			 * log.info("Name=" + employeeInfo.getName()); log.info("Age=" +
			 * employeeInfo.getAge()); log.info("Dob=" + employeeInfo.getDob());
			 * log.info("Gender=" + employeeInfo.getGender()); log.info("Designation=" +
			 * employeeInfo.getDesignation()); log.info("Email=" + employeeInfo.getEmail());
			 */
		}
		/* session.close(); */
	}
}
