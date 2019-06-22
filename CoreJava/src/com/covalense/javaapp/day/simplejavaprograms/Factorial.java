package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class Factorial {
	static int fact(int a) {
		if (a == 0) {
			return 1;
		}
		return a * fact(a - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		int res = fact(num);
		log.info("factorial of " + num + " is " + res);
	}

}
