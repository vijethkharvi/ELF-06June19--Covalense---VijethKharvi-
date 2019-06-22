package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class CarWale {

	public static void main(String[] args) {
		int price = 570000;
		double rto = 14.26;
		double insu = 9.76;
		double amount = (price * rto) / 100;
		double insurance = (price * insu) / 100;
		double onroad = price + amount + insurance;

		log.info("Ex-showroom Price " + price);
		log.info("rto " + amount);
		log.info("insurance " + insurance);
		log.info("On road " + onroad);
	}

}
