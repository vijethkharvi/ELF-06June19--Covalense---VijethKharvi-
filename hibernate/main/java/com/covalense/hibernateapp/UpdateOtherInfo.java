package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.javaapp.covalense.bean.dto.EmployeeOtherInfo;

public class UpdateOtherInfo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfo.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfo empinfo = session.get(EmployeeOtherInfo.class, 1001);
		empinfo.setPan("AUAPAPAPAP");

		Transaction transaction = session.beginTransaction();
		session.update(empinfo);
		transaction.commit();
		session.close();
	}
}
