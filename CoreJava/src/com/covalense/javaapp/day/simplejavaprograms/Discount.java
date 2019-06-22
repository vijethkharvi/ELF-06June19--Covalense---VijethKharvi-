package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class Discount {

	public static void main(String[] args) {
		double price = 250;
		double discount = 15.4;
		int visitCount = 1;

		if (visitCount == 1) {
			double price1 = price - (price * discount) / 100;
			log.info(price1 + "you need to pay in paytm");
		} else {
			log.info(price + "you need pay in paytm");
		}
	}

}
