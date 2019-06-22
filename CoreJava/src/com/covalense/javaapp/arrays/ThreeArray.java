package com.covalense.javaapp.arrays;

public class ThreeArray {
	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		System.arraycopy(a, 2, b, 3, 2);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
