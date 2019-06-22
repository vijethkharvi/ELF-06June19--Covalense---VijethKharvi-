package com.covalense.javaapp.hasarelationshipone;

import lombok.extern.java.Log;

@Log
public class Person {
	Mobile m = new Mobile();
	int i = 5;

	void walk() {
		log.info("person walking");
	}
}
