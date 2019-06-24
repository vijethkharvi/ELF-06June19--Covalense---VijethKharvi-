package com.covalense.javaaap.pattern;

public class PatternSeven {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i >= 2 && j > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.print("*");
			System.out.println();

		}
	}
}