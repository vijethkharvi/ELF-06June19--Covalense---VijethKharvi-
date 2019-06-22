package com.covalense.javaapp.abstraction.authentic;

import lombok.extern.java.Log;

@Log
public class Gmail extends Google {
	void shareDocument() {
		log.info("gmail");
	}
}
