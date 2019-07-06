package com.covalense.designpatterns.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatter.beans.EmployyeBeanJava;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {

	}

	private static SessionFactory buildSessionFactory() {

		return new Configuration().configure().addAnnotatedClass(EmployyeBeanJava.class).buildSessionFactory();

	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return getSessionFactory().openSession();

	}
}
