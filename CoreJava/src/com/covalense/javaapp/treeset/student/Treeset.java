package com.covalense.javaapp.treeset.student;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Student> al = new TreeSet();

		Student s1 = new Student();
		s1.name = "vijeth";
		s1.id = 23;
		s1.percentage = 78;

		Student s2 = new Student();
		s2.name = "prajwal";
		s2.id = 24;
		s2.percentage = 70;

		Student s3 = new Student();
		s3.name = "ck";
		s3.id = 25;
		s3.percentage = 88;

		Student s4 = new Student();
		s4.name = "varshan";
		s4.id = 23;
		s4.percentage = 78;

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		for (Student r : al) {
			System.out.println(r);
		}
	}

}
