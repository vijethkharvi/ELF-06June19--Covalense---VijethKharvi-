package com.covalense.mywebapp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dept_info")
public class DeptInfoBean {
	@Id
	@Column(name = "Dept_id")
	private int deptId;
	@Column(name="Dept_name")
	private String deptName;

}
