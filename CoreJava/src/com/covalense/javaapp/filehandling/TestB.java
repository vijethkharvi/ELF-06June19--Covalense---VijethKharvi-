package com.covalense.javaapp.filehandling;

import java.io.File;

import lombok.extern.java.Log;
@Log
public class TestB {
	public static void main(String[] args) {
		File f = new File("movies/kannada/new/gultu");
		boolean res = f.mkdirs();
		log.info("result is " + res);
	}
}
