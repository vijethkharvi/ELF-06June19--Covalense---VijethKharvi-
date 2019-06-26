package com.covalense.javaapp.overriding.carlevel;

import lombok.extern.java.Log;

@Log
public class LevelTwo extends LevelOne {
	void speed() {
		log.info("speed is 100-150");
	}
}
