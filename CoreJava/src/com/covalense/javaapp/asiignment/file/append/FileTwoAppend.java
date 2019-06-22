package com.covalense.javaapp.asiignment.file.append;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileTwoAppend {

	public static void main(String[] args) {

		try {

			FileUtils.writeStringToFile(new File("FileAppend2.txt"), "vijeth");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
