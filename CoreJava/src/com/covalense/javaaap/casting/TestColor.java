package com.covalense.javaaap.casting;

public class TestColor {

	public static void main(String[] args) {
		Pen p = new Marker1();
		Marker1 m = (Marker1) p;
		p.cost = 120;
		p.write();
		m.size = 20;
		m.color();

	}

}
