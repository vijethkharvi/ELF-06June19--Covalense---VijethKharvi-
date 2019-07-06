package com.covalense.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("viju", 23, 9916078484L);
		log.info("Name :" + immutableClass.getName());
		log.info("age :" + immutableClass.getAge());
		log.info("phone :" + immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("prajwal", 24, 88996078484L);
		log.info("Name :" + immutableClass.getName());
		log.info("age :" + immutableClass.getAge());
		log.info("phone :" + immutableClass.getPhone());
		

	}// end of main
}// end of class
