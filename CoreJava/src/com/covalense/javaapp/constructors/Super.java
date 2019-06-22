package com.covalense.javaapp.constructors;

class A {
	int i = 90;
}

class B extends A {
	int i = 60;

	void m() {
		int i = 30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

public class Super {

	public static void main(String[] args) {
		B k = new B();
		k.m();

	}

}
