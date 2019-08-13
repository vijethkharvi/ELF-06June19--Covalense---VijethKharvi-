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


//@XmlAccessorType(XmlAccessType.FIELD)

@Embeddable
public class EmployeeAddressPKBean implements Serializable{
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfo info;
	public EmployeeInfo getInfo() {
		return info;
	}
	public void setInfo(EmployeeInfo info) {
		this.info = info;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Column(name="address_type")
	private String addressType;
}
