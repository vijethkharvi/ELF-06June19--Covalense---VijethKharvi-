package com.covalense.javaapp.overriding.carlevel;

import lombok.extern.java.Log;

@Log
public class LevelThree extends LevelTwo {
	void speed() {
		log.info("speed is 150-200km");
	}
}
