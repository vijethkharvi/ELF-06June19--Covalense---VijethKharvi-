package com.covalense.javaapp.arraylist;
import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("prajwal");
		al.add("ck");
		al.add("varshan");
		al.add("Vijeth");

		for (int i = 0; i < al.size(); i++) {
			String r = al.get(i);
			System.out.println(r);
		}

	}
}
