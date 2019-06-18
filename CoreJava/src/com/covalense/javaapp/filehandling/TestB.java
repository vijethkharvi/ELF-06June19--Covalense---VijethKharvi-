package com.covalense.javaapp.filehandling;

import java.io.File;

public class TestB {
	public static void main(String[] args) {
		File f = new File("movies/kannada/new/gultu");
		boolean res = f.mkdirs();
		System.out.println("result is " + res);
	}
}
