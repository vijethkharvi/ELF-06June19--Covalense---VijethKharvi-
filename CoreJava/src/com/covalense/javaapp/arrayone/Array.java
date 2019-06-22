package com.covalense.javaapp.arrayone;
import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;
@Log
public class Array {

	public static void main(String[] args) {
		Integer[] a = { 5, 2, 3, 1, 4 };
		Arrays.sort(a,Collections.reverseOrder());

		log.info(Arrays.toString(a));

	}

}
