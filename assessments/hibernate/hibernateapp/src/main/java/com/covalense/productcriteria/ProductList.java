package com.covalense.productcriteria;

import java.awt.image.RescaleOp;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.util.HibernateUtil;

import net.sf.ehcache.search.expression.Criteria;

public class ProductList {
private void psvm() {
try(Session session = HibernateUtil.getSession()){
	Criteria criteria=session.createCriteria(ProductBean.class)
			Criterion criterion=Restrictions.allEq("price",300);
}
}
}
