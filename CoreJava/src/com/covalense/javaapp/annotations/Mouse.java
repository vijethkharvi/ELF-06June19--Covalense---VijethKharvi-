package com.covalense.javaapp.annotations;

import lombok.extern.java.Log;

@Log
public class Mouse {
	void click() {
		log.info("mouse click");
	}

	void doubleclick() {
		log.info("doubleclick");
	}

	@Deprecated
	void scroll() {
		log.info("");
	}
}
