package com.covalense.javaapp.arraylist.examples;
import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(15.2);
		al.add(9.2);
		al.add(9.0);
		al.add(3.3);
		
		for(Double r:al) {
			System.out.println(r);
		}
	}

}
