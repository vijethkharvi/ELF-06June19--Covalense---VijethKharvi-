package com.covalense.javaapp.asessment;

import lombok.extern.java.Log;

//WAP to calculate simple interest using lambda expression

@Log
public class TestSimpleIntrest {

	public static void main(String[] args) {
		SimpleIntrest s = (p, t, r) -> (p * t * r) / 100;
		int a = s.simpleintrest(10,2,5000);
		log.info("simple intrest is " + a);
	}

}
