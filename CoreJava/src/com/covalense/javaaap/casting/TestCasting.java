package com.covalense.javaaap.casting;

public class TestCasting {

	public static void main(String[] args) {
		Animal a = new Cow();
		Cow c = (Cow) a;
		a.i = 10;
		a.eat();
		c.run();
		System.out.println(a.i);

	}

}
