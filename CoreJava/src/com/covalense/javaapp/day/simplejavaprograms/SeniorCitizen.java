package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class SeniorCitizen {

	public static void main(String[] args) {
		double price=200;
		double discount=15.2;
		int age=90;
		if (age>=60) {
			double senPrice=price-(price*discount)/100;
			log.info("please pay "+senPrice);

		}
		else {
			log.info("please pay "+price);
		}
	}

}
