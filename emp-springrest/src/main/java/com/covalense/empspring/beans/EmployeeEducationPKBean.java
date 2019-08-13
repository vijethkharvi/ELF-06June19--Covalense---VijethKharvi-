package com.covalense.empspring.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;
@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationPKBean implements Serializable{
	public EmployeeInfo getInfo() {
		return info;
	}
	public void setInfo(EmployeeInfo info) {
		this.info = info;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfo info;
	@Column(name="education_type")
	private String educationType;
}
