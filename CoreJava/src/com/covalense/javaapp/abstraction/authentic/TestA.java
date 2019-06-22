package com.covalense.javaapp.abstraction.authentic;

public class TestA {

	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail m = new Gmail();
		Drive d = new Drive();
		b.open(d);
	}

}
