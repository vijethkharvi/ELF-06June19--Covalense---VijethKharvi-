package com.covalense.javaapp.abstraction.bank;

public class Canara implements ATMCard {

	@Override
	public void validate() {
System.out.println("canara bank validation");
	}

	@Override
	public void getInfo() {
System.out.println("canara bank information");
	}

}
