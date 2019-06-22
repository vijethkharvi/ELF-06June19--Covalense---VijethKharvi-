package com.covalense.javaapp.bean.employee;

import lombok.extern.java.Log;

@Log
public class Db1 {
	void recive(Employee p) {
		log.info("******DB1********");
		log.info("name is " + p.getName1());
		log.info("salary is " + p.getSalary());
		log.info("gender is " + p.getGender());

	}
}
