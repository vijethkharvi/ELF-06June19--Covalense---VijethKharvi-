package com.covalense.hibernateapp.cache;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class NewEmployeeBean implements Serializable {
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
	private long accno;

	@Column(name = "email")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "Dept_id")
	private int departmentId;

	@Column(name = "manager_id")
	private int managerId;

}
