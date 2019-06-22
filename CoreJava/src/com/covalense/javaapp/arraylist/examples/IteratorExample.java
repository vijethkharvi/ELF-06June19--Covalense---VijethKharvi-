package com.covalense.javaapp.arraylist.examples;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add('A');
		al.add("Vijeth");
		
		Iterator it=al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
			
		}
	}

}
