package com.covalense.javaapp.assignment1;

public class EvenDivisibleFive {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%5==0 && i%2==0) {
				System.out.println(i);
			}
		}
	}

}
