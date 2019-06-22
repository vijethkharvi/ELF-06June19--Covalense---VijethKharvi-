package com.covalense.javaapp.overriding.carlevel;

import lombok.extern.java.Log;

@Log
public class Level2 extends Level1 {
	void speed() {
		log.info("speed is 100-150");
	}
}
