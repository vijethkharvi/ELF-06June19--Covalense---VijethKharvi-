package com.covalense.javaapp.hibernate.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.hibernateapp.bean.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class RestirctionGet {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployyeBeanJava.class);
		// .add(Restrictions.gt("salary", 10000));
		Criterion cr = Restrictions.eq("id",1002);
		criteria.add(cr);
		EmployyeBeanJava employyeBeanJava = (EmployyeBeanJava) criteria.uniqueResult();
		log.info("ID=" + employyeBeanJava.getId());
		log.info("name=" + employyeBeanJava.getName());
		log.info("age=" + employyeBeanJava.getAge());
		log.info("gender=" + employyeBeanJava.getGender());
		log.info("salary=" + employyeBeanJava.getSalary());
		log.info("email id=" + employyeBeanJava.getEmail());
		log.info("Designation=" + employyeBeanJava.getDesignation());

	}
}
