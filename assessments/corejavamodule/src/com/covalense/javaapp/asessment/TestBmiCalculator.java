package com.covalense.javaapp.asessment;
//8)	WAP to calculate the BMI and print the BMI with result. (Eg; 22.1 is Normal)

import lombok.extern.java.Log;

@Log
public class TestBmiCalculator {

	public static void main(String[] args) {
		BmiCalculator s = (w, h) -> w /( h * h);
		int a = (int) s.bmical(51, 2.0);
		log.info("your BMI value is" + a);
		if (a < 18) {
			log.info("you are under weight");
		} else if (a < 29 && a < 18) {
			log.info("Normal");
		} else {
			log.info("you are overweight");
		}
	}

}
