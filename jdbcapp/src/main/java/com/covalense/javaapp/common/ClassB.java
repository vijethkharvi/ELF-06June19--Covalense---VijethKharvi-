package com.covalense.javaapp.common;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {

	@Override
	public void printmessege() {
		log.info("BBBBB");
	}

}
