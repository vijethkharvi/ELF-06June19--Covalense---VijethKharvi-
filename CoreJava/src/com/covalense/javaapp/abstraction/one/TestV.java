package com.covalense.javaapp.abstraction.one;

public class TestV {

	public static void main(String[] args) {
		Printer p = (Printer) new Sony();
		p.print();
	}

}
