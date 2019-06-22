package com.covalense.javaapp.abstraction.bank;

import lombok.extern.java.Log;

@Log
public class Icici implements ATMCard {
	public void validate() {
		log.info("ICICI bank validation");
	}

	public void getInfo() {
		log.info("ICICI bank information");
	}
}
