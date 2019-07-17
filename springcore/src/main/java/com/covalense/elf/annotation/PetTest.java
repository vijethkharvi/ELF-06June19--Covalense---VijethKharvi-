package com.covalense.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetTest {

	public static void main(String[] args) {
		// ApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(PetConfig.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("petconfig.xml");
		Pet pet = (Pet) applicationContext.getBean("pet");
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
	}

}
