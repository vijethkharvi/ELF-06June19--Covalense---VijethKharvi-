package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.designpatterns.util.HibernateUtil;

public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public ArrayList<EmployyeBeanJava> getAllEmployeeInfo() {
		// to do
		return null;
	}

	@Override
	public EmployyeBeanJava getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));

	}

	@Override
	public EmployyeBeanJava getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();

		// 4.interact with db via session
		EmployyeBeanJava bean = session.get(EmployyeBeanJava.class, id);
		// 5.close session
		session.close();
		return bean;

	}

	private boolean saveOrUpdate(EmployyeBeanJava bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployyeBeanJava bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployyeBeanJava bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployyeBeanJava bean = new EmployyeBeanJava();
		bean.setId(id);
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
