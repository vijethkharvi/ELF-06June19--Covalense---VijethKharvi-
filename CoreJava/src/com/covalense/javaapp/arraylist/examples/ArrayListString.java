package com.covalense.javaapp.arraylist.examples;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("prajwal");
		al.add("ck");
		al.add("varshan");
		al.add("Vijeth");

		for (int i = 0; i < al.size(); i++) {
			String r = al.get(i);
			log.info(r);
		}

	}
}
