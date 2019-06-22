package com.covalense.javaapp.day.simplejavaprograms;

import lombok.extern.java.Log;

@Log
public class LangCode {

	public static void main(String[] args) {
		int token = 3;
		switch (token) {
		case 1:
			log.info("kannada is selected");
			break;
		case 2:
			log.info("engliash is selcted");
			break;
		case 3:
			log.info("konkani is selected");
			break;
		default:
			log.info("invalid input");

		}
	}

}
