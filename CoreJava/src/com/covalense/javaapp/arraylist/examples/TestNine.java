package com.covalense.javaapp.arraylist.examples;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestNine {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		li.add(4);
		li.add(1.5);
		li.add('d');
		li.add("vijeth");
		li.add(3.6);
		
		ListIterator lit=li.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
			
		}

	}

}
