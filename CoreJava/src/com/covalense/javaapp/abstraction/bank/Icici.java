package com.covalense.javaapp.abstraction.bank;

public class Icici implements ATMCard{
public void validate() {
	System.out.println("ICICI bank validation");
}
public void getInfo() {
	System.out.println("ICICI bank information");
}
}
