package com.covalense.javaapp.set;

import java.util.HashSet;

import lombok.extern.java.Log;
@Log
public class ExampleGenricHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("viju");
		hs.add("jio");
		hs.add("airtel");
		hs.add("vodapone");

		for (String r : hs) {
			log.info(r);
		}

	}

}
