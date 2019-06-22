package com.covalense.javaapp.constructors;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;
	int age;
	double percentage;

	Student(String name, int age, double per) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}

	void display() {
		log.info("name is " + name);
		log.info("age is " + age);
		log.info("percentage is " + percentage);
	}
}
