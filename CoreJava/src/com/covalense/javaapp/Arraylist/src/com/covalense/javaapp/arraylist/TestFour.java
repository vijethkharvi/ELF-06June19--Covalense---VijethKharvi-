package com.covalense.javaapp.arraylist;
import java.util.ArrayList;

public class TestFour {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		System.out.println("before----->" + al);
		Double ref=al.set(2, 3.9);
		
		System.out.println("removed object is"+ref);
		
		System.out.println("after----->" + al);

	}

}
