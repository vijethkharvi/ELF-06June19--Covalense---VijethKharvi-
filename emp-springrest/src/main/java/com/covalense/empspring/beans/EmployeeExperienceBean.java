package com.covalense.empspring.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
import lombok.ToString;
@Entity
@Table(name = "employee_experience_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceBean implements Serializable {
	public EmployeeExperiencePKBean getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(EmployeeExperiencePKBean employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	@EmbeddedId
	private EmployeeExperiencePKBean employeeExperience;
	@Column(name="designation")
	private String designation;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="leaving_date")
	private Date leavingDate;

}
