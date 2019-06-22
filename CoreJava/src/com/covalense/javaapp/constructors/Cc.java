package com.covalense.javaapp.constructors;

import lombok.extern.java.Log;

@Log
public class Cc {
	Cc(int x) {
		log.info("this is integer");
	}

	Cc(double a) {
		log.info("this is double");
	}
}
