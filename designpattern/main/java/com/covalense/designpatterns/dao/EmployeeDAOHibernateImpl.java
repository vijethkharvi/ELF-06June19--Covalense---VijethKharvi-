package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatter.beans.EmployyeBeanJava;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployyeBeanJava> getAllEmployeeInfo() {
		// to do
		return null;
	}

	@Override
	public EmployyeBeanJava getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));

	}

	@Override
	public EmployyeBeanJava getEmployeeInfo(int id) {
		//1.load the config file
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.configure("com/covalense/designpatterns/MyHibernateConfigFile.xml");
		/*try {
			cfg.configure(new URL("https://raw.githubusercontent.com/vijethkharvi/ELF-06June19-Covalense-VijethKharvi/master/SQL/MyHibernateConfigFile.xml"));
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}*/
		cfg.addAnnotatedClass(EmployyeBeanJava.class);
		//2.build session factory
		SessionFactory factory = cfg.buildSessionFactory();
		//3.open session
		Session session = factory.openSession();
		//4.interact with db via session
		EmployyeBeanJava bean = session.get(EmployyeBeanJava.class, id);
		//5.close session
		session.close();
		return bean;

	}

}
