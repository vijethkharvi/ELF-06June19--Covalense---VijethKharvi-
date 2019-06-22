package com.covalense.javaapp.beanone;

import lombok.extern.java.Log;

@Log
public class Db2 {
	void recive(Person p) {
		log.info("******DB2********");
		log.info("name is" + p.getName());
		log.info("age is" + p.getAge());
	}
}
