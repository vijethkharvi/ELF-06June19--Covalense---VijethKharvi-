package com.covalense.javaapp.asiignment.file.read;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOne {

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("file1.text"), "this is file1 content");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
