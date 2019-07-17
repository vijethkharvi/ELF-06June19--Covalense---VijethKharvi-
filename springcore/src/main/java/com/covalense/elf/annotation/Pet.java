package com.covalense.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springcore.annotation.interf.Animal;

import lombok.Data;

@Data
public class Pet {

	private String name;
	@Autowired
	private Animal animal;
}
