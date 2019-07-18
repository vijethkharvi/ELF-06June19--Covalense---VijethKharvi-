package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfo implements Serializable {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "pan")
	private String pan;

	@Column(name = "ismarried")
	private boolean ismarried;

	@Column(name = "blood_group")
	private String bloodgroup;

	@Column(name = "ischallenged")
	private boolean ischallenged;

	@Column(name = "emergency_contact_number")
	private long emergencyContactNumber;

	@Column(name = "emergency_contact_name")
	private String emergencyContactName;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "religion")
	private String religion;

	@Column(name = "father_nm")
	private String fatherName;

	@Column(name = "mother_nm")
	private String motherName;

	@Column(name = "spouse_nm")
	private String spouseName;

	@Column(name = "passport")
	private String passport;

	@Column(name = "adhar")
	private long adhaar;

}
