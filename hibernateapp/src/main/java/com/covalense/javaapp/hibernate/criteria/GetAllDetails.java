package com.covalense.javaapp.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.hibernateapp.bean.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		log.info("session factory created");
		Criteria criteria = session.createCriteria(EmployyeBeanJava.class);
		List<EmployyeBeanJava> emp = criteria.list();
		for (EmployyeBeanJava employyeBeanJava : emp) {
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
