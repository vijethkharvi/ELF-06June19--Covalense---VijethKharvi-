package com.covalense.javaapp.arrayone;

import lombok.extern.java.Log;

@Log
public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = { 3, 4, 2, 5, 3 };
		int d[] = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
			d[i] = a[i];
		}

		for (int i = 0; i < d.length; ++i) {
			log.info(d[i] + " ");
		}

	}
}