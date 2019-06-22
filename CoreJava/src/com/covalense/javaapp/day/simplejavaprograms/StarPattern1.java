package com.covalense.javaapp.day.simplejavaprograms;

import java.io.*;

public class StarPattern1 {
	public static void printStars(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			System.out.println("*");
			for (j = 0; j < n; j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		printStars(n);
	}

}
