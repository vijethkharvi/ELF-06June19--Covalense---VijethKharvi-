package com.covalense.javaaap.pattern;

public class PatternSix {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
