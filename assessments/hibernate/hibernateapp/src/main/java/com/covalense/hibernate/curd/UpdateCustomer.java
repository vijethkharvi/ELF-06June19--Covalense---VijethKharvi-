package com.covalense.hibernate.curd;

import org.hibernate.Session;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.bean.CustomerBean;

public class UpdateCustomer {

	public static void main(String[] args) {
		org.hibernate.Transaction transaction = null;
		Session session = HibernateUtil.getSession();

		CustomerBean bean = new CustomerBean();
		bean.setId(11);
		bean.setFirstname("vijeth");
		bean.setLastName("kharvi");
		bean.setCounty("kundapura");
		bean.setAddress("udupi");
		bean.setCounty("india");
		bean.setContact(23424224l);
		transaction = session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}

}
