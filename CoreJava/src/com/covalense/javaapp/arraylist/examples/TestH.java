package com.covalense.javaapp.arraylist.examples;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(15.2);
		al.add(9.2);
		al.add(9.0);
		al.add(3.3);

		for (int i = 0; i < al.size(); i++) {
			double r = al.get(i);
			System.out.println(r);
		}
	}

}
