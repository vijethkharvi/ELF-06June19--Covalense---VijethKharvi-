package com.covalense.javaapp.constructors;

import lombok.extern.java.Log;

@Log
public class Girl {
	public void recieve(Phone p) {
		{
			if (p instanceof MiPhone) {
				log.info("thank you brother");
			}
			if (p instanceof IPhone) {
				log.info("I love you");
			}
		}
	}
}
