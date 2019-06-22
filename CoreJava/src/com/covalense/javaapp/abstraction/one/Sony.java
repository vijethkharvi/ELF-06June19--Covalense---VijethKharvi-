package com.covalense.javaapp.abstraction.one;

import lombok.extern.java.Log;

@Log
public class Sony implements Printer {
	public void print() {
		log.info("printing");
	}
}
