package com.covalense.javaaap.treeset.car;

import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TreeCar {

	public static void main(String[] args) {
		TreeSet<Car> al = new TreeSet();

		Car c1 = new Car();
		c1.name = "a4";
		c1.brand = "audi";
		c1.cost = 700000;
		c1.rating = 5;

		Car c2 = new Car();
		c2.name = "verna";
		c2.brand = "hundai";
		c2.cost = 90000;
		c2.rating = 4.6;

		Car c3 = new Car();
		c3.name = "baleno";
		c3.brand = "suzuki";
		c3.cost = 8000;
		c3.rating = 3.5;

		Car c4 = new Car();
		c4.name = "punto";
		c4.brand = "fiat";
		c4.cost = 80000;
		c4.rating = 2.2;

		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);

		for (Car r : al) {
			log.info("name is " + r.name);
			log.info("brand is " + r.brand);
			log.info("cost is " + r.cost);
			log.info("rating is " + r.rating);
			log.info("--------------");

		}
	}

}
