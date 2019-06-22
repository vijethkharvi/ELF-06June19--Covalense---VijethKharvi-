package com.covalense.javaapp.passingobject;

import lombok.extern.java.Log;

@Log
public class Pen {
	void open() {
		log.info("opening a pen");
	}

	void write() {
		log.info("write using pen");
	}
}
