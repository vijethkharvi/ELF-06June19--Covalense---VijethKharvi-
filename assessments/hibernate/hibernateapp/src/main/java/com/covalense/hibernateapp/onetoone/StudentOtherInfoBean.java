package com.covalense.hibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student_otherinfo")
public class StudentOtherInfoBean {

	@Id
	@Column(name = "rollNum")
	private int rollNum;

	@Column(name = "fatherName")
	private String fatherName;

	@Column(name = "motherName")
	private String motherName;

	@Column(name = "religion")
	private String religion;

	@Column(name = "nationality")
	private String nationality;


}
