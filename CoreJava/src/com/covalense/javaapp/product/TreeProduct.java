package com.covalense.javaapp.product;

import java.util.TreeSet;

public class TreeProduct {

	public static void main(String[] args) {
		TreeSet<Product> al = new TreeSet();

		Product p1 = new Product();
		p1.name = "football";
		p1.cost = 500;
		p1.rating = 5;

		Product p2 = new Product();
		p2.name = "basketball";
		p2.cost = 700;
		p2.rating = 4.5;

		Product p3 = new Product();
		p3.name = "mobile";
		p3.cost = 6000;
		p3.rating = 4.4;

		Product p4 = new Product();
		p4.name = "pen";
		p4.cost = 20;
		p4.rating = 2.2;

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);

		for (Product r : al) {
			System.out.println("name is " + r.name);
			System.out.println("cost is " + r.cost);
			System.out.println("rating is " + r.rating);
			System.out.println("--------------");

		}
	}
}
