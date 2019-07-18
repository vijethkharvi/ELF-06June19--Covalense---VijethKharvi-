package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernate.util.PrepareUtil;

import lombok.extern.java.Log;
@Log
public class OneToOneStudent {

	public static void main(String[] args) {
		int rollno=10;
		StudentInfoBean data=PrepareUtil.prepareData(rollno);
		save(data);
		
		
	}
	public static void save(StudentInfoBean data) {
		Transaction txn = null;
		try (Session session = HibernateUtil.getSession()) {
			txn = (Transaction) session.beginTransaction();
			session.save(data);
			txn.commit();
		} catch (Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));
			if (txn != null) {              
				try {
					txn.rollback();
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}

			} // end of try catch
		}
	}

}
