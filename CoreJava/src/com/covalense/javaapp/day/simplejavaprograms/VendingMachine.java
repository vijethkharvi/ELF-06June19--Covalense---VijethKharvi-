package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class VendingMachine {

	public static void main(String[] args) {
		int amount = 10;
		switch (amount) {
		case 10:
			log.info("lays");
			break;
		case 20:
			log.info("kurkure");
			break;
		case 30:
			log.info("dairy milk");
			break;
		default:
			log.info("Invalid option");
			break;
		}

	}
}
