package com.covalense.hibernateapp.bean.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.hibernateapp.onetoone.EmployeeInfo;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfo;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	private static SessionFactory buildSessionFactory() {

		// create the sessuion factory from hibernate.cfg.xml

		/*
		 * Configuration cfg = new Configuration(); cfg.configure(); SessionFactory
		 * sessionFactory = cfg.buildSessionFactory(); return sessionFactory;
		 */

		return new Configuration().configure().addAnnotatedClass(EmployeeInfo.class)
				.addAnnotatedClass(EmployeeOtherInfo.class).buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	public static Session getSession() {
		return getSessionFactory().openSession();

	}
}
