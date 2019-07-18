package com.covalense.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;

public class HibernateUtil {
private static SessionFactory sessionFactory=null;
private static SessionFactory buildSessionFactory() {
	return new Configuration().configure().addAnnotatedClass(CustomerBean.class).buildSessionFactory();
	
}
private static SessionFactory getSessionFactory() {
	if(sessionFactory==null) {
		sessionFactory=buildSessionFactory();
	}
	return sessionFactory;
}
public static Session getSession() {
	
	return getSessionFactory().openSession();
	
}//end of getSession()
}//end of class
