package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.annotation.interf.Animal;

@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {
		return new Pet();
	}

	@Bean(name = "monkey")
	public Animal getMonkey() {
		return new Monkey();
	}

	@Bean(name = "donkey")
	public Animal getDonkey() {
		return new Donkey();
	}
}
