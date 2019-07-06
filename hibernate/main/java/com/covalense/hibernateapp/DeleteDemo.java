package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.bean.util.HibernateUtil;
import com.covalense.javaapp.covalense.bean.dto.EmployeeInfo;

public class DeleteDemo {

	public static void main(String[] args) {
		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * cfg.addAnnotatedClass(EmployeeInfo.class);
		 */

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		EmployeeInfo empinfo = session.get(EmployeeInfo.class, 1013);
		Transaction transaction = session.beginTransaction();
		session.delete(empinfo);
		transaction.commit();
		session.close();

	}

}
