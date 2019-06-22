package com.covalense.javaaap.casting;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	int x;

	void run() {
		log.info("cow running");
	}
}
