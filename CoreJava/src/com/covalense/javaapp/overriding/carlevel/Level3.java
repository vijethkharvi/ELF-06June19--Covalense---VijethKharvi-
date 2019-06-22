package com.covalense.javaapp.overriding.carlevel;

import lombok.extern.java.Log;

@Log
public class Level3 extends Level2 {
	void speed() {
		log.info("speed is 150-200km");
	}
}
