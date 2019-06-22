package com.covalense.javaapp.hasarelationship.car;

import lombok.extern.java.Log;

@Log
public class Car {
	int i = 5;
	Music m = new Music();

	void Drive() {
		log.info("driving");
	}
}
