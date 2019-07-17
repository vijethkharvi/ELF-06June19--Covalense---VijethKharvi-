package com.covalense.springcore.annotation;

import com.covalense.springcore.annotation.interf.Animal;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
		log.info("eating grass");
	}

	@Override
	public void makeSound() {
		log.info("enki pinki donkey");
	}

}
