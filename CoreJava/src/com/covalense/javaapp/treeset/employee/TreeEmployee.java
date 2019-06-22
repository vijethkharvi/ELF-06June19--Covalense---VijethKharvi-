package com.covalense.javaapp.treeset.employee;

import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TreeEmployee {

	public static void main(String[] args) {
		EmployeeById emp = new EmployeeById();
		EmpBySalary ems = new EmpBySalary();
		TreeSet<Employee> t = new TreeSet<Employee>(ems);

		Employee e1 = new Employee();
		e1.name = "ramesh";
		e1.id = 32;
		e1.salary = 700000;

		Employee e2 = new Employee();
		e2.name = "suresh";
		e2.id = 31;
		e2.salary = 72300;

		Employee e3 = new Employee();
		e3.name = "abdulla";
		e3.id = 33;
		e3.salary = 6600;

		Employee e4 = new Employee();
		e4.name = "rabi";
		e4.id = 34;
		e4.salary = 700000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Employee r : t) {
			log.info("name is " + r.name);
			log.info("id is" + r.id);
			log.info("salary is " + r.salary);
			log.info("--------------");

		}
	}
}
