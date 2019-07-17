package com.covalense.mywebapp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.mywebapp.beans.DeptInfoBean;
import com.covalense.mywebapp.beans.EmployyeBeanJava;
import com.covalense.mywebapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployyeBeanJava> getAllEmployeeInfo() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select * from EmployeeInfo";
		Query query = session.createQuery(hql);
		List<EmployyeBeanJava> ename = query.list();
		return ename;
	}

	@Override
	public EmployyeBeanJava getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));

	}

	public EmployyeBeanJava getEmployeeInfo(int id) {
		EmployyeBeanJava bean = null;
		try (Session session = HibernateUtil.openSession();) {
			// 4.interact with db via session
			bean = session.get(EmployyeBeanJava.class, id);
			// 5.close session
			return bean;
		}

	}

	private boolean saveOrUpdate(EmployyeBeanJava bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {

			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
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

	public List<EmployyeBeanJava> setAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployyeBeanJava setEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	private boolean saveOrUpdate(DeptInfoBean bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {

			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}
	
	@Override
	public boolean createDeptInfoBean(DeptInfoBean bean) {
		return saveOrUpdate(bean);
	}
   
}
