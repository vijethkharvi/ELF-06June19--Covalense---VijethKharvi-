package com.covalense.javaaap.casting;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	double size;

	void color() {
		log.info("color");
	}

}
