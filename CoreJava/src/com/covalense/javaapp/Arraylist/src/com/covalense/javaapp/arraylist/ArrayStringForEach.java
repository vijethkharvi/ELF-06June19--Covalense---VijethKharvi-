package com.covalense.javaapp.arraylist;
import java.util.ArrayList;

public class ArrayStringForEach {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("charu");
		al.add("cks");
		al.add("vijeth");
		al.add("swetha");
		
		for(String r:al) {
			System.out.println(r);
		}
	}

}
