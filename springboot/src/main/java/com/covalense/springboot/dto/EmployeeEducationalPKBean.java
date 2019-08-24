package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalPKBean implements Serializable{
	//@JsonBackReference
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean empInfo;
	@Column(name="education_type")
	private String educationType;
	public EmployeeInfoBean getEmpInfo() {
		return empInfo;
	}
	public void setEmpInfo(EmployeeInfoBean empInfo) {
		this.empInfo = empInfo;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
}
