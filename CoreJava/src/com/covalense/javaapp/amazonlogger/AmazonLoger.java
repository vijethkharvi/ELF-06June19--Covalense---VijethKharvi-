package com.covalense.javaapp.amazonlogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLoger {
	private static final Logger Loger = Logger.getLogger("amazon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();

		FileHandler fh;
		try {
			fh = new FileHandler("amazon.log");
			fh.setLevel(Level.ALL);
			Loger.addHandler(fh);
			fh.setFormatter(new SimpleFormatter());

			Loger.log(Level.SEVERE, "hi its a SEVERE message");
			Loger.log(Level.WARNING, "hi its a WARNING message");
			Loger.log(Level.INFO, "hi its a INFO message");
			Loger.log(Level.CONFIG, "hi its a CONFIG message");
			Loger.log(Level.FINE, "hi its a FINE message");
			Loger.log(Level.FINER, "hi its a FINER message");
			Loger.log(Level.FINEST, "hi its a FINEST message");

			Register r = new Register();
			r.store();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
