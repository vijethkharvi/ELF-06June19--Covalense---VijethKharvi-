package com.covalense.javaapp.common;

public class DriverManager {
	private DriverManager() {

	}

	public static Connection getConnection(String str) {
		Connection ref = null;
		if (str.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;

	}// end of instance

}// end of class
