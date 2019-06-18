package com.covalense.javaapp.beantwo;

public class TestEmp {

	public static void main(String[] args) {
		Employee a=new Employee();
		a.setName("vijeth");
		a.setSalary(10000);
		a.setGender('m');
		Db1 i=new Db1();
		i.recive(a);
		Db2 j=new Db2();
		j.recive(a);	}

}
