package com.covalense.hibernateapp.bean.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;

	}
	

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}
}
