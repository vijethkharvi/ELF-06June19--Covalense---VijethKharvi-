package com.covalense.javaapp.arraycopy;

import java.util.logging.Logger;

public class CopyArray {
	private static final Logger Logger = java.util.logging.Logger.getLogger("employee2");

	public static void main(String[] args) {
		int[]a= {2,3,4,2,3,56};
		int[]b= {8,7,6,5,4,3};
		System.arraycopy(a, 2,b, 0,5);
		for(int i=0;i<=a.length;i++) {
			if(i<a.length-1) {
			Logger.info("array"+a[i]);
		}
			
	}
}
}


