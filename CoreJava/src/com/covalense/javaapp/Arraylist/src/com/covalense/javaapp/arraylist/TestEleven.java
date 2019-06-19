package com.covalense.javaapp.arraylist;
import java.util.LinkedList;

public class TestEleven {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();

		li.add("vijeth");
		li.add("surendra");
		li.add("vikram");
		li.add("amba");
		li.add("devi");
		
		
		for(String r:li) {
			System.out.println(r);
		}

	}

}
