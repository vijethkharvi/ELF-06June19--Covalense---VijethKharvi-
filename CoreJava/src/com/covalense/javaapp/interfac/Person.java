package com.covalense.javaapp.interfac;

import lombok.extern.java.Log;

@Log
public class Person implements Animal, Human {

	public void walk() {
		log.info("waliking");
	}

	public void eat() {
		log.info("eat");
	}
}
