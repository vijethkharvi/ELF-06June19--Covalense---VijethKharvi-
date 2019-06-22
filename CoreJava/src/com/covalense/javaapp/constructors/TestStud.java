package com.covalense.javaapp.constructors;

import lombok.extern.java.Log;

@Log
public class TestStud {

	public static void main(String[] args) {
		Student s = new Student("vijeth", 22, 70);
		s.display();
		log.info("$$$$$$$$$$");
		Student p = new Student("prajwal", 24, 78);
		p.display();

	}

}
