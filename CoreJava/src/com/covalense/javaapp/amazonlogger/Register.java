package com.covalense.javaapp.amazonlogger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

	private static final Logger Loger = Logger.getLogger("amazon");
	
	void connectDb() {
		Loger.log(Level.SEVERE, "hi its a SEVERE message");
	}
	void store() {
		Loger.log(Level.WARNING, "hi its a WARNING message");
	}
}
