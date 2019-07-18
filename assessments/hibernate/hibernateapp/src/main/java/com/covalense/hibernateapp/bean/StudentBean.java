package com.covalense.hibernateapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentBean {
	@Id
	@Column(name="rollNum")
	private int rollno;
	@Id
	@Column(name="firstName")
	private String firstname;
	@Id
	@Column(name="lastname")
	private String lastname;
	@Id
	@Column(name="subject")
	private String subject;
	@Id
	@Column(name="totalMarks")
	private int totalmarks;
	
}
