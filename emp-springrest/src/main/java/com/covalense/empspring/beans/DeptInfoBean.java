package com.covalense.empspring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
@Entity
//@XmlAccessorType(XmlAccessType.FIELD)
@Table(name="dept_info")
public class DeptInfoBean {
	@Id
	@Column(name="Dept_id")
	private Integer deptId;
	@Column(name="Dept_name")
	private String deptName;
	public Integer getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
