package com.covalense.javaapp.overriding;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	void write() {
		log.info("im writing using marker");
	}
}
