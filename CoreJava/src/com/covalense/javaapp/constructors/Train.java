package com.covalense.javaapp.constructors;

import lombok.extern.java.Log;

@Log
public class Train {
	void search(int i) {
		log.info("searched using number");
	}

	void search(String b) {
		log.info("searched using name");
	}

}
