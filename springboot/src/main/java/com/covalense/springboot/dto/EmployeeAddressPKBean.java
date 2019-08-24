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
public class EmployeeAddressPKBean implements Serializable {
	//@JsonBackReference
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean empInfo;
	@Column(name="address_type")
	private String addressType;
	
	public EmployeeInfoBean getEmpInfo() {
		return empInfo;
	}
	public void setEmpInfo(EmployeeInfoBean empInfo) {
		this.empInfo = empInfo;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
}
