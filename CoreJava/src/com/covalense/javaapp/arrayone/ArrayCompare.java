package com.covalense.javaapp.arrayone;

import java.util.Arrays;

import lombok.extern.java.Log;
@Log
public class ArrayCompare {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		int[] arr3 = new int[] { 1, 2, 4, 3 };

		log.info("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
		log.info("is arr1 equals to arr3 : " + Arrays.equals(arr1, arr3));
	}

}
