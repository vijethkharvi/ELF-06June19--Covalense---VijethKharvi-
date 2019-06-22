package com.covalense.javaapp.asiignment.file.append;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;
@Log
public class FileAppendText {

	public static void main(String[] args) {

		try {
			String data = FileUtils.readFileToString(new File("FileAppend1.txt"));
			FileUtils.writeStringToFile(new File("FileAppend2.txt"),data,true);
			log.info("sucsussfully copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
