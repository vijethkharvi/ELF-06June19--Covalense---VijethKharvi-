package com.covalense.javaapp.arraylist.examples;

import java.util.LinkedList;

import lombok.extern.java.Log;
@Log
public class TestEleven {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();

		li.add("vijeth");
		li.add("surendra");
		li.add("vikram");
		li.add("amba");
		li.add("devi");

		for (String r : li) {
			log.info(r);
		}

	}

}
