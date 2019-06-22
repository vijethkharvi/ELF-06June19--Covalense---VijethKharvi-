package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class MethodToAdd {
	static int viju(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int i = viju(10, 7);
		log.info("Result is " + i);
	}

}
