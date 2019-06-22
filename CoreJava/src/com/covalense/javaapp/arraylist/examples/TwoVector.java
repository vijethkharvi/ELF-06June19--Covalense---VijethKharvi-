package com.covalense.javaapp.arraylist.examples;

import java.util.Enumeration;
import java.util.Vector;

public class TwoVector {

	public static void main(String[] args) {
		Vector<Integer> ve = new Vector<Integer>();

		ve.add(1);
		ve.add(23);
		ve.add(55);
		ve.add(33);
		ve.add(22);

		Enumeration<Integer> e = ve.elements();
		while (e.hasMoreElements()) {
			Integer k = e.nextElement();
			System.out.println(k);

		}
	}

}
