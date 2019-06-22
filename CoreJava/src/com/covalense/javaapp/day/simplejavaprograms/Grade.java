package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class Grade {

	public static void main(String[] args) {
		double percentage = 91;
		if (percentage >= 80) {
			log.info("your grade is distinction");
		} else if (percentage >= 60) {
			log.info("your grade is first class");
		} else if (percentage >= 50) {
			log.info("your grade is second class");
		} else if (percentage >= 35) {
			log.info("your grade is pass class");

		} else {
			log.info("your grade is fail");
		}
	}

}
