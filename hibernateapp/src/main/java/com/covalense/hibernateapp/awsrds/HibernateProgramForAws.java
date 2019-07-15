package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.cache.NewEmployeeBean;

import lombok.extern.java.Log;
@Log
public class HibernateProgramForAws {
	public static void main(String[] args) {
		// 1.Load the config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(EmployeeBean.class);

		// 2.build the session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3.open session
		Session session = sessionFactory.openSession();

		// 4.interact db with session
		EmployeeBean bean = session.get(EmployeeBean.class, 1001);
		log.info("1st time:" + bean.toString());

		// 5.close the session
		session.close();

	}
}
