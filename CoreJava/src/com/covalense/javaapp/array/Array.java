package com.covalense.javaapp.array;

public class Array {

	public static void main(String[] args) {
		double[] a = new double[4];
		a[0] = 2.1;
		a[1] = 3.2;
		a[2] = 13.0;
		a[3] = 15.6;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
