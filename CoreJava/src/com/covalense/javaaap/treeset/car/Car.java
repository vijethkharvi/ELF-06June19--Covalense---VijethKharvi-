package com.covalense.javaaap.treeset.car;

public class Car implements Comparable<Car> {
	String name;
	String brand;
	int cost;
	double rating;

	@Override
	public int compareTo(Car o) {
		int k = this.name.compareTo(o.name);
		return k;
	}
}
