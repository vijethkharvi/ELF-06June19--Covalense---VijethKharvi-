package com.covalense.javaapp.arraylist;
import java.util.LinkedList;

public class TestSeven {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		li.add(4);
		li.add(1.5);
		li.add('d');
		li.add("vijeth");
		li.add(3.6);
		
		for(Object r:li) {
			System.out.println(r);
		}
	}

}
