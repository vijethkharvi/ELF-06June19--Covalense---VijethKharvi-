package com.covalense.javaapp.set;
import java.util.HashSet;
import java.util.Iterator;

public class ExampleHash {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(2.4);
		hs.add('A');
		hs.add("viju");
		
		for(Object r:hs) {
			System.out.println(r);
		}
		
		

	}

}
