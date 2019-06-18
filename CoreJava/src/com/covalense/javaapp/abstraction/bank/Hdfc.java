package com.covalense.javaapp.abstraction.bank;

public class Hdfc implements ATMCard {
	public void validate() {
		System.out.println("HDFC validation");
	}
	public void getInfo() {
		System.out.println("HDFC get information");
	}

}
