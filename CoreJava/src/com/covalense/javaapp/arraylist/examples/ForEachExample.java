package com.covalense.javaapp.arraylist.examples;

import java.util.ArrayList;

public class ForEachExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Vijeth");

		for (Object r : al) {
			System.out.println(r);
		}
	}

}
