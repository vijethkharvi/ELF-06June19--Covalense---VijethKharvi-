package com.covalense.javaapp.arraylist.examples;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class TestFive {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		log.info("before----->" + al);

		Double ref = al.remove(2);

		log.info("removed object is" + ref);

		log.info("after----->" + al);

	}

}
