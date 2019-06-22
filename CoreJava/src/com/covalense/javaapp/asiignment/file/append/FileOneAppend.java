package com.covalense.javaapp.asiignment.file.append;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOneAppend {

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("FileAppend1.txt"), "kharvi");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
