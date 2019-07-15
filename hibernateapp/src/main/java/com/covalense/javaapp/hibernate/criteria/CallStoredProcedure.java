package com.covalense.javaapp.hibernate.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.hibernateapp.bean.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallStoredProcedure {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("getrecords",EmployyeBeanJava.class);

		List<EmployyeBeanJava> beans = query.getResultList();

		for (EmployyeBeanJava employyeBeanJava : beans) {
			log.info("ID=" + employyeBeanJava.getId());
			log.info("name=" + employyeBeanJava.getName());
			log.info("age=" + employyeBeanJava.getAge());
			log.info("gender=" + employyeBeanJava.getGender());
			log.info("phone=" + employyeBeanJava.getPhone());

			log.info("email id=" + employyeBeanJava.getEmail());
			log.info("Designation=" + employyeBeanJava.getDesignation());

		}
	}

}
