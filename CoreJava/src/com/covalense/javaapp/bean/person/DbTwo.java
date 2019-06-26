package com.covalense.javaapp.bean.person;

import lombok.extern.java.Log;

@Log
public class DbTwo {
	void recive(Person p) {
		log.info("******DB2********");
		log.info("name is" + p.getName());
		log.info("age is" + p.getAge());
	}
}
