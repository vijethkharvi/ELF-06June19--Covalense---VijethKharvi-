package com.covalense.javaapp.abstraction.authentic;

public class Browser {
	void open(Drive d) {
		d.login();
		d.shareDocument();
	}
}
