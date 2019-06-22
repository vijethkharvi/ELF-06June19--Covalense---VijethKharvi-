package com.covalense.javaapp.arraylist.examples;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Vijeth");

		for (int i = 0; i <al.size(); i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}
}
