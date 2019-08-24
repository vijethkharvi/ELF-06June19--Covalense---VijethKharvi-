package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable{
	//@JsonBackReference
	//@XmlTransient  //<===@JsonIgnore (similar)
	@JsonIgnore
	@OneToOne
	@Id
	@JoinColumn(name="id")
	//@PrimaryKeyJoinColumn(name="ID")
	private EmployeeInfoBean empInfo;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="ismarried")
	private boolean ismarried;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="ischallenged")
	private boolean ischallenged;
	
	@Column(name="emergency_contact_number")
	private long emergencyContactNum;
	
	@Column(name="emergency_contact_name")
	private String emergencyContactName;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="father_nm")
	private String fatherName;
	
	@Column(name="mother_nm")
	private String motherName;
	
	@Column(name="spouse_nm")
	private String spouseName;
	
	@Column(name="passport")
	private String passport;
	
	@Column(name="adhar")
	private long adhar;

	public EmployeeInfoBean getEmpInfo() {
		return empInfo;
	}

	public void setEmpInfo(EmployeeInfoBean empInfo) {
		this.empInfo = empInfo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public boolean isIsmarried() {
		return ismarried;
	}

	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public boolean isIschallenged() {
		return ischallenged;
	}

	public void setIschallenged(boolean ischallenged) {
		this.ischallenged = ischallenged;
	}

	public long getEmergencyContactNum() {
		return emergencyContactNum;
	}

	public void setEmergencyContactNum(long emergencyContactNum) {
		this.emergencyContactNum = emergencyContactNum;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

}
