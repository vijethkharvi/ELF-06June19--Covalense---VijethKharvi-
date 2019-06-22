package com.covalense.javaapp.abstraction.one;

import lombok.extern.java.Log;

@Log
public abstract class Pencil {
	void draw() {
		log.info("draw method");

	}

	abstract void write();

	abstract void color();
}
