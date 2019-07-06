package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.javaapp.covalense.bean.dto.EmployeeInfo;
import com.covalense.javaapp.covalense.bean.dto.EmployeeOtherInfo;

public class SaveEmployeeotherInfo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeOtherInfo.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfo empOtherInf = new EmployeeOtherInfo();
		empOtherInf.setId(1011);
		empOtherInf.setPan("AUAPV7292B");
		empOtherInf.setIsmarried(true);
		empOtherInf.setBloodgroup("b+");
		empOtherInf.setIschallenged(false);
		empOtherInf.setEmergencyContactNumber(919916013212L);
		empOtherInf.setEmergencyContactName("prajwal");

		empOtherInf.setNationality("india");
		empOtherInf.setReligion("hindu");
		empOtherInf.setFatherName("surendra");
		empOtherInf.setMotherName("amba");
		empOtherInf.setSpouseName("arod");
		empOtherInf.setPassport("4623423");
		empOtherInf.setAdhaar(123456789012L);

		Transaction transaction = session.beginTransaction();
		session.save(empOtherInf);
		transaction.commit();
		session.close();

	}

}
