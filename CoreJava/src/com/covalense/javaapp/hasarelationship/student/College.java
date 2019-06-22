package com.covalense.javaapp.hasarelationship.student;

import lombok.extern.java.Log;

@Log
public class College {
	static Student s = new Student();

	void teach() {
		log.info("teaching");
	}

}
