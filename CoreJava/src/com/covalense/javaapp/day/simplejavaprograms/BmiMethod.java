package com.covalense.javaapp.day.simplejavaprograms;

public class BmiMethod {
	static double bmi(double height,double weight) {
		double bmi=(weight)/(height)*(height);
		return bmi;
	}
	public static void main(String[] args) {
		double bmiValue=bmi(70,1.8);
		 
	}

}
