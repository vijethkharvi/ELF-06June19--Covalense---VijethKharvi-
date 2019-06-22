package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class OddEven {

	public static void main(String[] args) {
		int num = 4;
		if (num % 2 == 0) {
			log.info(num + " is even number");
		} else {
			log.info(num + " is odd number");
		}

	}

}
