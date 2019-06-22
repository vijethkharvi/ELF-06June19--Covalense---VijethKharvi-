package com.covalense.javaapp.immutable;

import lombok.extern.java.Log;

@Log
public abstract class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("vijeth", 23);
		p.getName();
		p.getAge();
		log.info("name is " + p.getName() + " age is" + p.getAge());

	}

}
