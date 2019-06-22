package com.covalense.javaapp.bean.person;

public class TestPers {

	public static void main(String[] args) {
		Person a = new Person();
		a.setName("vijeth");
		a.setAge(23);
		Db1 i = new Db1();
		i.recive(a);
		Db2 j = new Db2();
		j.recive(a);

	}

}
