package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.util.HibernateUtil;
import com.covalense.javaapp.covalense.bean.dto.EmployeeInfo;

public class SaveDemo {

	public static void main(String[] args) {
		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * cfg.addAnnotatedClass(EmployeeInfo.class);
		 */

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		EmployeeInfo empinf = new EmployeeInfo();
		empinf.setId(6);
		empinf.setName("amanda");
		empinf.setAge(31);
		empinf.setGender("female");
		empinf.setSalary(10020);
		empinf.setPhone(919678013212L);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = format.parse("2019-10-10");
			empinf.setJoiningDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empinf.setAccno(10003995345676L);
		empinf.setEmail("inana@gmail.com");
		empinf.setDesignation("singer");
		Date date2;
		try {
			date2 = format.parse("1991-10-10");
			empinf.setDob(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empinf.setDeptid(6);
		empinf.setMngrid(21);

		Transaction transaction = session.beginTransaction();
		// session.save(empinf);
		session.saveOrUpdate(empinf);
		transaction.commit();
		session.close();

	}

}
