package com.covalense.javaapp.arraylist.examples;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ArrayStringForEach {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("charu");
		al.add("cks");
		al.add("vijeth");
		al.add("swetha");

		for (String r : al) {
			log.info(r);
		}
	}

}
