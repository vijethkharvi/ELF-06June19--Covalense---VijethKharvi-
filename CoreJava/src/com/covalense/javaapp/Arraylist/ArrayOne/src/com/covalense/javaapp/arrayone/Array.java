package com.covalense.javaapp.arrayone;
import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		Integer[] a = { 5, 2, 3, 1, 4 };
		Arrays.sort(a,Collections.reverseOrder());

		System.out.println(Arrays.toString(a));

	}

}
