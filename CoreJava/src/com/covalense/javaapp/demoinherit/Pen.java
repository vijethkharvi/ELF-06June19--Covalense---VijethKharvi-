package com.covalense.javaapp.demoinherit;

import lombok.extern.java.Log;

@Log
public class Pen extends Parent {
	int cost;

	void write() {
		log.info("this is pen");
	}
}
