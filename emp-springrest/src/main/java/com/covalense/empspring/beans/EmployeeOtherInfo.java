package com.covalense.empspring.beans;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "employee_otherinfo")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfo implements Serializable {
	public EmployeeInfo getInfobean() {
		return infobean;
	}

	public String getPan() {
		return pan;
	}

	public Boolean getIsmarried() {
		return ismarried;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public Boolean getIschallenged() {
		return ischallenged;
	}

	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public String getReligion() {
		return religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public String getPassport() {
		return passport;
	}

	public Long getAdhaar() {
		return adhaar;
	}

	public void setInfobean(EmployeeInfo infobean) {
		this.infobean = infobean;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setIsmarried(Boolean ismarried) {
		this.ismarried = ismarried;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public void setIschallenged(Boolean ischallenged) {
		this.ischallenged = ischallenged;
	}

	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public void setAdhaar(Long adhaar) {
		this.adhaar = adhaar;
	}
	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name="id")
	private EmployeeInfo infobean;

	@JsonProperty(value="PAN")
	@Column(name = "pan")
	private String pan;

	@Column(name = "ismarried")
	private Boolean ismarried;

	@Column(name = "blood_group")
	private String bloodgroup;

	@Column(name = "ischallenged")
	private Boolean ischallenged;

	@Column(name = "emergency_contact_number")
	private Long emergencyContactNumber;

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
	private Long adhaar;

}
