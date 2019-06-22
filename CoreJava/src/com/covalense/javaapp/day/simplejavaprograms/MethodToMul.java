package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class MethodToMul {
	static int mul(int a, int b) {
		int c = a * b;
		return c;

	}

	public static void main(String[] args) {
		int i = mul(3, 4);
		log.info("Result is " + i);
	}

}
