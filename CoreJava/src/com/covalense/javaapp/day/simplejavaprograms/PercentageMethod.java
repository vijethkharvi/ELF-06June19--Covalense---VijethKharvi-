package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class PercentageMethod {
	static double grade(int a, int b) {
		double c = (a * 100) / b;
		return c;
	}

	public static void main(String[] args) {
		double i = grade(417, 625);
		log.info("percentage is " + i);

	}

}
