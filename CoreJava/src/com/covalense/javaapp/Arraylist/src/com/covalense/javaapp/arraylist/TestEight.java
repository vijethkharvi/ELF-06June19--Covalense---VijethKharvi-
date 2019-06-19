package com.covalense.javaapp.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestEight {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		li.add(4);
		li.add(1.5);
		li.add('d');
		li.add("vijeth");
		li.add(3.6);
		
		Iterator it=li.iterator();
		while (it.hasNext()) {
			Object r =it.next();
			System.out.println(r);
			
		}
		
		
		
	}

}
