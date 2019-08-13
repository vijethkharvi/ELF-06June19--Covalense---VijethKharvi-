package com.covalense.empspring.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.empspring.beans.EmployeeInfo;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * @Autowired private HibernateUtil hibernateUtil;
	 */
	@Override
	public List<EmployeeInfo> getAllEmployeeInfo() {
		Session session = sessionFactory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfo> empBeans = query.list();
		return empBeans;

	}

	@Override
	public EmployeeInfo getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfo getEmployeeInfo(int id) {
		EmployeeInfo bean = null;
		Session session = sessionFactory.openSession();
			bean = session.get(EmployeeInfo.class, id);
			return bean;
		
	}

	/*
	 * @Override public boolean saveOrUpdate(EmployeeInfo bean) { Transaction txn =
	 * null; try (Session session = sessionFactory.openSession();) { txn =
	 * session.beginTransaction(); session.saveOrUpdate(bean); txn.commit(); return
	 * true; } catch (Exception e) { log.severe(Arrays.toString(e.getStackTrace()));
	 * if (txn != null) { txn.rollback(); } return false; } }
	 */

	/*
	 * @Override public boolean createEmployeeInfo(EmployeeInfo bean) {
	 * 
	 * return saveOrUpdate(bean); }
	 */

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfo bean = new EmployeeInfo();
		bean.setId(id);
		try (Session session = sessionFactory.openSession();) {
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.deepToString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfo empInfo) {
		return saveOrUpdate(empInfo);
	}

	@Override
	public boolean saveOrUpdate(EmployeeInfo bean) {
		Transaction txn = null;
		try (Session session = sessionFactory.openSession();) {
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public List<Integer> getAllEmployeeIds(String id) {
		try (Session session = sessionFactory.openSession();) {
			String hql = "select e.id from EmployeeInfoBean e where str(e.id) LIKE " + "\'" + id + "%\'";
			Query query = session.createQuery(hql);
			List<Integer> empIds = query.list();

			return empIds;
		}
	}

	@Override
	public List<String> getAllEmployeeNames(String id) {
		try (Session session = sessionFactory.openSession();) {
			String hql = "select e.name from EmployeeInfoBean e where str(e.id) LIKE " + "\'" + id + "%\'";
			Query query = session.createQuery(hql);
			List<String> empNames = query.list();
			return empNames;
		}
	}

	// @Override
	/*
	 * public boolean saveOrUpdate(EmployeeInfo bean) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean createEmployeeInfo(EmployeeInfo empInfo) { // TODO
	 * Auto-generated method stub return false; }
	 */
}
