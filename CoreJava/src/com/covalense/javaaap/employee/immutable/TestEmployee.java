package com.covalense.javaaap.employee.immutable;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("vijeth", 23, 160, 'm', true);
		e.getAge();
		e.getGender();
		e.getHeight();
		e.getName();
		e.isStatus();

	}

}
