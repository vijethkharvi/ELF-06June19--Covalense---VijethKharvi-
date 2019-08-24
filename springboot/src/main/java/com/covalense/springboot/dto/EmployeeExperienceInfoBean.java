package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;

@Entity
@Table(name = "employee_experience_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceInfoBean implements Serializable{
	public EmployeeExperiencePKBean getEmpPKBean() {
		return empPKBean;
	}
	public void setEmpPKBean(EmployeeExperiencePKBean empPKBean) {
		this.empPKBean = empPKBean;
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
	private EmployeeExperiencePKBean empPKBean;
	@Column(name = "designation")
	private String designation;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "leaving_date")
	private Date leavingDate;

}
