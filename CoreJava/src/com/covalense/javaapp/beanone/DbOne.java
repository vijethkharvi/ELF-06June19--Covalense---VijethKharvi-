package com.covalense.javaapp.beanone;

import lombok.extern.java.Log;

@Log
public class DbOne {
	void recive(Person p) {
		log.info("******DB1********");
		log.info("name is " + p.getName());
		log.info("age is " + p.getAge());
	}
}
