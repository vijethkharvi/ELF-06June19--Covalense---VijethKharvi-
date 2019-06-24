package com.covalense.javaapp.assignmenttwo.employee;
public class Employee {
	
	String name = "vijeth";
	int id = 567;
	double salary = 50000;

	void employee(String s) {
		if(s==name) {
		System.out.println("name is: " + name);
		System.out.println("id is: " + id);
		System.out.println("Salary is: " + salary);
		}else {
			System.out.println("details not found");
		}
	}
	
	void employee(int i) {
		if(i==id) {
			System.out.println("name is: " + name);
			System.out.println("id is: " + id);
			System.out.println("Salary is: " + salary);
			}else {
				System.out.println("details not found");
			}
	}
}
