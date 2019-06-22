package com.covalense.javaapp.overriding;

public class TestC {

	public static void main(String[] args) {
		Pen p = new Marker();
		p.write();
		Pen q = new Pen();
		q.write();
	}

}
