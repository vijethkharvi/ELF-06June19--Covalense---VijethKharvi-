package com.covalense.javaapp.abstraction.one;

import lombok.extern.java.Log;

@Log
public abstract class Hero {
	void engine() {
		log.info("im engine method");
	}

	abstract void design();
}
