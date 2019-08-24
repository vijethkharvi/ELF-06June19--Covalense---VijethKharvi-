package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;

//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "dept_info")
public class DepartmentInfoBean implements Serializable{
	@Id
	@Column(name = "Dept_id")
	private int deptId;
	@Column(name = "Dept_name")
	private String deptName;
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
