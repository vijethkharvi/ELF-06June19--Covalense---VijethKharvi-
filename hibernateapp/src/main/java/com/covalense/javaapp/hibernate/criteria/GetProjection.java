package com.covalense.javaapp.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.designpatter.beans.EmployyeBeanJava;
import com.covalense.hibernateapp.bean.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetProjection {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployyeBeanJava.class);

		Projection pro = Projections.property("name");
		Projection pro2 = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(pro);
		projectionList.add(pro2);
		criteria.setProjection(projectionList);

		criteria.setProjection(pro);
		/*
		 * List<EmployyeBeanJava> emp = criteria.list(); for (EmployyeBeanJava empbean :
		 * emp) { log.info("id is" + empbean.getId()); log.info("name is" +
		 * empbean.getName());
		 * 
		 * }
		 */
		List<Object[]> str = criteria.list();
		for (Object[] objects : str) {
			log.info("id" + objects[0]);
			log.info("name is" + objects[1]);

		}

	}

}
