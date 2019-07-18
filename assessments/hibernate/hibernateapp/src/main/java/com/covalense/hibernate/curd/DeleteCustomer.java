package com.covalense.hibernate.curd;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.bean.CustomerBean;

public class DeleteCustomer {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		Transaction txn = null;
		Session session = HibernateUtil.getSession();

		CustomerBean bean = session.get(CustomerBean.class, 10);

		txn = (Transaction) session.beginTransaction();
		session.delete(bean);
		txn.commit();
		session.close();
	}

}
