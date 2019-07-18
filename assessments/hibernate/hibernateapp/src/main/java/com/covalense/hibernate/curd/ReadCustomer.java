package com.covalense.hibernate.curd;

import org.hibernate.Session;

import com.covalense.hibernate.util.HibernateUtil;
import com.covalense.hibernateapp.bean.CustomerBean;

import lombok.extern.java.Log;
@Log
public class ReadCustomer {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		CustomerBean bean=session.get(CustomerBean.class,10);
		
		log.info("Customer id is"+bean.getId());
		log.info("Customer First name is"+bean.getFirstname());
		log.info("Customer Second is"+bean.getLastName());
		log.info("Customer contact number is"+bean.getContact());
		log.info("Customer address is"+bean.getAddress());
		log.info("Customer city is"+bean.getCity());
		
		session.close();
	}

}
