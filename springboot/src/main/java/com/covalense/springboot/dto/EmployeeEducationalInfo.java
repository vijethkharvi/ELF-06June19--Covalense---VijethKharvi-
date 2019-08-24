package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;


@Entity
@Table(name="employee_educational_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalInfo implements Serializable {
	@EmbeddedId
	private EmployeeEducationalPKBean empEducationInfo;
	@Column(name="degree_type")
	private String degreeType;
	@Column(name="branch")
	private String branch;
	@Column(name="college_nm")
	private String collegeName;
	@Column(name="university")
	private String university;
	@Column(name="yop")
	private String yop;
	@Column(name="percentage")
	private double percentage;
	@Column(name="location")
	private String location;
	public EmployeeEducationalPKBean getEmpEducationInfo() {
		return empEducationInfo;
	}
	public void setEmpEducationInfo(EmployeeEducationalPKBean empEducationInfo) {
		this.empEducationInfo = empEducationInfo;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
