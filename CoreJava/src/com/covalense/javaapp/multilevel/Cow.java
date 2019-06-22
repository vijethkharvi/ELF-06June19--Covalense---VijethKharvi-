package com.covalense.javaapp.multilevel;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	void walk() {
		log.info("im cow");
	}
}
