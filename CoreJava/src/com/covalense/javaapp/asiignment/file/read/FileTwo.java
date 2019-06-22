package com.covalense.javaapp.asiignment.file.read;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;
@Log
public class FileTwo {
	
	public static void main(String[] args) {

		try {
			String data = FileUtils.readFileToString(new File("file1.text"));
			FileUtils.writeStringToFile(new File("file2.text"), data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
