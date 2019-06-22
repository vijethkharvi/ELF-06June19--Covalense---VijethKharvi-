package com.covalense.javaapp.set;
import java.util.HashSet;
import java.util.Iterator;

public class HashIterator {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(2.4);
		hs.add('A');
		hs.add("viju");
		
		
		Iterator it= hs.iterator();
		while (it.hasNext()) {
			Object r =it.next();
			System.out.println(r);
			
		}			
			
		
	}

}
