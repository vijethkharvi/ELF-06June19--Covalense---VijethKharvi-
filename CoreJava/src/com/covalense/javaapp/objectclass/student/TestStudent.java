package com.covalense.javaapp.objectclass.student;

import lombok.extern.java.Log;

@Log
public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student("vijeth", 22, 5.5);
		Student p = new Student("vijeth", 22, 6.0);
		boolean b = s.equals(p);
		log.info("both are equal?" + b);
		log.info("first student details" + s);
		log.info("second student details" + p);
	}

}
