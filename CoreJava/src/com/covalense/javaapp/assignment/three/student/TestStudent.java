package com.covalense.javaapp.assignment.three.student;

import lombok.extern.java.Log;

@Log
public class TestStudent {

	public static void main(String[] args) {
		Student[] s = new Student[4];
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		Student d = new Student();

		a.setName("vijeth");
		a.setMarks(85);
		b.setName("prajwal");
		b.setMarks(75);
		c.setName("ck");
		c.setMarks(90);
		d.setName("varshan");
		d.setMarks(78);

		s[0] = a;
		s[1] = b;
		s[2] = c;
		s[3] = d;

		for (int i = 0; i <= 3; i++) {
			log.info("name of student is " + s[i].getName() + " obtained " + s[i].getMarks());
		}

	}

}
