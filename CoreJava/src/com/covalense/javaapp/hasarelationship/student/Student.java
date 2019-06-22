package com.covalense.javaapp.hasarelationship.student;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;

	void play() {
		log.info(name + " student playiing");
	}
}
