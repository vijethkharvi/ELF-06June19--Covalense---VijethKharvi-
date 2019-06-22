package com.covalense.javaapp.abstraction.bank;

import lombok.extern.java.Log;

@Log
public class Hdfc implements ATMCard {
	public void validate() {
		log.info("HDFC validation");
	}

	public void getInfo() {
		log.info("HDFC get information");
	}

}
