package com.covalense.javaapp.asessment;

//WAP to compare the equality of two objects.
import lombok.extern.java.Log;

@Log
public class TestObject {

	public static void main(String[] args) {
		LionObject l = new LionObject();
		CowObject c = new CowObject();
		log.info("" + l.equals(c));

	}

}
