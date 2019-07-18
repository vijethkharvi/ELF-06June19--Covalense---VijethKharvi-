package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.bean.util.HibernateUtil;
import com.covalense.hibernateapp.bean.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOnetoOneTest {

	public static void main(String[] args) throws ParseException{

		// prepare Data
		int id = 333;
		EmployeeInfo data = PrepareDataUtil.perpareData(id);
		save(data);

	}// end of main

	private static void save(EmployeeInfo data) {

		Transaction txn = null;
		try (Session session = HibernateUtil.getSession()) {
			txn = session.beginTransaction();
			session.save(data);
			txn.commit();
		} catch (Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));
			if (txn != null) {
				txn.rollback();

			} // end of try catch
		}
	}// end of prepare data

}// end of class
