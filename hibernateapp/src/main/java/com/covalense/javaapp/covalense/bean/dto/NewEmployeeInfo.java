package com.covalense.javaapp.covalense.bean.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "newemp_info")
public class NewEmployeeInfo {
	@Id
	@Column
	private int eid;
	@Column
	private String name;
	@Column
	private String email;
}
