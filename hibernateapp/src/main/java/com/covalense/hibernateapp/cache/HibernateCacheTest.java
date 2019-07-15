package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		// 1.Load the config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeBean.class);

		// 2.build the session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 3.open session
		Session session = sessionFactory.openSession();

		// 4.interact db with session
		NewEmployeeBean bean = session.get(NewEmployeeBean.class, 1001);
		log.info("1st time:"+bean.toString());
		
		NewEmployeeBean bean2 = session.get(NewEmployeeBean.class, 1001);
		log.info("2nd time:"+bean2.toString());

		NewEmployeeBean bean3 = session.get(NewEmployeeBean.class, 1001);
		log.info("3rd time:"+bean3.toString());


		// 5.close the session
		session.close();

	}// end of main
}// end of class
