package com.covalense.javaapp.abstraction.bank;

import lombok.extern.java.Log;

@Log
public class Canara implements ATMCard {

	@Override
	public void validate() {
		log.info("canara bank validation");
	}

	@Override
	public void getInfo() {
		log.info("canara bank information");
	}

}
