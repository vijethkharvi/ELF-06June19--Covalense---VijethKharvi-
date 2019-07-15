package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.bean.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		// String hql = "update from EmployyeBeanJava set name='vikas' where id=1002";
		String hql = "update from EmployyeBeanJava set name=:name where id=:id";
		// String hql = "update from EmployyeBeanJava set name='" + args[0] + "' where
		// id=" + args[1] + "";
		Query query = session.createQuery(hql);
		query.setParameter("name", args[0]);
		query.setParameter("id", Integer.parseInt(args[1]));
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated " + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
