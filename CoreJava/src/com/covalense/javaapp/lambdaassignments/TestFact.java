
package com.covalense.lambdaassignments;

import lombok.extern.java.Log;

@Log
public class TestFact {

	public static void main(String[] args) {
		Factorial f = i -> {
			int k = 1;
			for (int j = 1; j <= i; j++) {
				k = k * 1;
			}
			return k;
		};
		int res = f.fact(5);
		log.info(""+res);
	}

}
