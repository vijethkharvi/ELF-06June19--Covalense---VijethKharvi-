package com.covalense.hibernate.curd;

import java.text.ParseException;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.bean.CustomerBean;

public class CreateCustomer {

	public static void main(String[] args) throws ParseException {
		org.hibernate.Transaction transaction = null;
		Session session = HibernateUtil.getSession();

		CustomerBean bean = new CustomerBean();
		bean.setId(10);
		bean.setFirstname("vijeth");
		bean.setLastName("kharvi");
		bean.setCounty("kundapura");
		bean.setAddress("udupi");
		bean.setCounty("india");
		bean.setContact(23424224l);
		transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}

}
