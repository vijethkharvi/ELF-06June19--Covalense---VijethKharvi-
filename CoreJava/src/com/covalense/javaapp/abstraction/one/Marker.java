package com.covalense.javaapp.abstraction.one;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {

	void color() {
		log.info("color method");
	}

}