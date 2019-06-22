package com.covalense.javaapp.abstraction.bank;

public class TestBank {

	public static void main(String[] args) {
		Machine m = new Machine();
		Hdfc h = new Hdfc();
		Icici i = new Icici();
		Canara c = new Canara();
		m.slot(c);
	}

}
