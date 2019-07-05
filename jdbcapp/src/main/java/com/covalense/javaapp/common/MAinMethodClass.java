package com.covalense.javaapp.common;

public class MAinMethodClass {

	public static void main(String[] args) {
		/* String str = new ClassA(); */
		String dbUrl = "two";
		Connection con = DriverManager.getConnection(dbUrl);
		con.printmessege();
	}// end of main

}// end of class
