package com.covalense.javaapp.assignment.three.product;

import lombok.extern.java.Log;

@Log
public class TestProduct {

	public static void main(String[] args) {
		Product p[] = new Product[4];
		Product e = new Product();
		Product f = new Product();
		Product g = new Product();
		Product h = new Product();

		e.setName("football");
		e.setPrice(600);
		f.setName("basket ball");
		f.setPrice(800);
		g.setName("tennis ball");
		g.setPrice(50);
		h.setName("badminton");
		h.setPrice(500);

		p[0] = e;
		p[1] = f;
		p[2] = g;
		p[3] = h;

		for (int i = 0; i <= 3; i++) {
			log.info("product name is " + p[i].getName() + " product price is " + p[i].getPrice());
		}

	}

}
