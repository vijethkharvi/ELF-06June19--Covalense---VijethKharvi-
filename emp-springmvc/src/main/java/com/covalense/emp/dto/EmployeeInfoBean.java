package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfoBean otherInfo;

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "salary")
	private double salary;

	@Column(name = "phone")
	private long phone;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "acount_number")
	private long accountNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "Dept_id")
	private int departmentId;

	@Column(name = "manager_id")
	private int managerId;
	
	@Column(name = "password")
	private String password;
}
