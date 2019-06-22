package com.covalense.javaapp.abstraction.authentic;

import lombok.extern.java.Log;

@Log
abstract public class Google {
	void login() {
		log.info("google login");
	}

	abstract void shareDocument();
}
