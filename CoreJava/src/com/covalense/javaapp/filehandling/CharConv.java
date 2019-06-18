package com.covalense.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CharConv {

	public static void main(String[] args) {
		String msg = "Up town ";
		char c[] = msg.toCharArray();

		try {
			FileWriter fw = new FileWriter("Password.txt");
			fw.write(c);
			fw.flush();
			fw.close();
			System.out.println("Done...!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
