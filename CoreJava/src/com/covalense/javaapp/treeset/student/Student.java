package com.covalense.javaapp.treeset.student;

public class Student implements Comparable<Student> {
	int percentage;
	int id;
	String name;
	@Override
	public int compareTo(Student o) {
		String a=this.name;
		String b=this.name;
		
		int k=a.compareTo(b);
		
		return k;
	}

	/*@logic to sort student w.r.t id
	public int compareTo(Student s) {
		if(this.id<s.id) {
			return -1;
			}
		else if(this.id>s.id) {
			return 1;
		}
		else {
			return 0;
		}*/
	/*@Override/*logic to sort students w.r.t percentage 
	/*public int compareTo(Student s) {
		if(this.percentage<s.percentage) {
			return-1;
		}
		else if(this.percentage>s.percentage) {
			return 1;
		}
		else {
			return 0;
		}*/
	}
