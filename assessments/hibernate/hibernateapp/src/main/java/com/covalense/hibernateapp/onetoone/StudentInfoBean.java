package com.covalense.hibernateapp.onetoone;

import javax.management.MXBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.covalense.hibernateapp.bean.CustomerBean;

import lombok.Data;
@Data
@Entity
@Table(name="student_info")
public class StudentInfoBean {
	@OneToOne(cascade=CascadeType.ALL)
	@Id
	@PrimaryKeyJoinColumn
	@Column(name="rollNum")
	private int rollNum;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobileNo")
	private long mobileNo;
	
	@Column(name="emailId")
	private String emailId;
	
	private StudentOtherInfoBean otherinfo;
	
	
}
