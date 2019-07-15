package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.javaapp.covalense.bean.dto.EmployeeInfo;

public class UpdateDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfo empinfo = session.get(EmployeeInfo.class, 1001);
		empinfo.setAge(23);

		Transaction transaction = session.beginTransaction();
		session.update(empinfo); 
		transaction.commit();
		session.close();
	}
}
