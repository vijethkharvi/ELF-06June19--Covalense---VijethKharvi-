package com.covalense.collectionsassignments;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		CompareIdEmp idc = new CompareIdEmp();
		CompareNameEmp namec = new CompareNameEmp();
		CompSalaryEmp salComp = new CompSalaryEmp();

		TreeSet<EmployeeBean> t = new TreeSet<EmployeeBean>();

		int ch = 2;

		EmployeeBean e1 = new EmployeeBean();
		e1.setId(1);
		e1.setName("Srav");
		e1.setSalary(25000);

		EmployeeBean e2 = new EmployeeBean();
		e2.setId(2);
		e2.setName("Sri");
		e2.setSalary(20000);

		EmployeeBean e3 = new EmployeeBean();
		e3.setId(3);
		e3.setName("Sai");
		e3.setSalary(22000);

		t.add(e1);
		t.add(e2);
		t.add(e3);

		switch (ch) {
		case 1:
			TreeSet<EmployeeBean> t1 = new TreeSet<EmployeeBean>(namec);
			break;
		case 2:
			TreeSet<EmployeeBean> t2 = new TreeSet<EmployeeBean>(idc);
			break;
		case 3:
			TreeSet<EmployeeBean> t3 = new TreeSet<EmployeeBean>(salComp);
			break;

		}

		for (EmployeeBean p : t) {
			log.info("details are : " + p);

		}

	}

}
