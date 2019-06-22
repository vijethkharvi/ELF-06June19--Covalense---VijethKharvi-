package com.covalense.javaapp.arraylist.examples;

import java.util.Vector;

public class VectorOne {

	public static void main(String[] args) {
		Vector ve = new Vector();

		ve.add(1);
		ve.add("surendra");
		ve.add("vikram");
		ve.add("amba");
		ve.add("devi");

		for (Object r : ve) {
			System.out.println(r);
		}

	}

}
