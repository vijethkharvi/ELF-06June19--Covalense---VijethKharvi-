package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class Bmi {

	public static void main(String[] args) {
		int weight = 50;
		double height = 1.75;
		double BMI = weight / (height * height);

		log.info("BMI is" + BMI);
	}

}
