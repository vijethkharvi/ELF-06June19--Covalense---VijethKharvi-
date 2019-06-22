package com.covalense.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class CharConv {

	public static void main(String[] args) {
		String msg = "Up town ";
		char c[] = msg.toCharArray();

		try {
			FileWriter fw = new FileWriter("Password.txt");
			fw.write(c);
			fw.flush();
			fw.close();
			log.info("Done...!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
