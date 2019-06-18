package com.covalense.javaapp.objectclass.student;

public class TestStudent {

	public static void main(String[] args) {
Student s=new Student("vijeth",22,5.5);
Student p=new Student("vijeth",22,6.0);
boolean b=s.equals(p);
System.out.println("both are equal?"+b);
System.out.println("first student details"+s);
System.out.println("second student details"+p);
	}

}
