package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	private static SessionFactory sessionFactory = null;

	private HibernateCacheUtil() {

	}

	private static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml")
					.addAnnotatedClass(NewEmployeeBean.class).buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
}
