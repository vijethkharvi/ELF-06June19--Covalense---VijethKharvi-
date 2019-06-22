package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class TestA {

	public static void main(String[] args) {
		File f = new File("vijeth.txt");
		try {
			boolean res= f.createNewFile();
			log.info("result is "+res);
			log.info("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
