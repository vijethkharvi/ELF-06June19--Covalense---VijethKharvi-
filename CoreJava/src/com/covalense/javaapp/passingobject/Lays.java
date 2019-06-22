package com.covalense.javaapp.passingobject;

import lombok.extern.java.Log;

@Log
public class Lays extends Chips {
	void open() {
		log.info("open lays");
	}

	void eat() {
		log.info("eat lays");
	}

}
