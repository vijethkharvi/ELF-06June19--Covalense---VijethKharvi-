package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class StringArray {

	public static void main(String[] args) {
		String[] st = new String[4];
		st[0] = "Vijeth";
		st[1] = "prajwal";
		st[2] = "ck";
		st[3] = "varshan";
		for (int i = 0; i < st.length; i++) {
			log.info(st[i]);
		}
		System.out.println(st.length);
	}

}
