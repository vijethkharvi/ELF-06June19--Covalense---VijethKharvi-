package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {
		File f = new File("vijeth.txt");
		try {
			boolean res= f.createNewFile();
			System.out.println("result is "+res);
			System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
