package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class GreatofThree {

	public static void main(String[] args) {
		int a = 18;
		int b = 60;
		int c = 15;
		if ((a > b) && (a > c)) {
			log.info("a is greatest of three");
		} else if ((b > a) && (b > c)) {
			log.info("b is greatest of three");

		} else if ((c > a) && (c > b)) {
			log.info("c is greatest of three");
		}
	}

}
