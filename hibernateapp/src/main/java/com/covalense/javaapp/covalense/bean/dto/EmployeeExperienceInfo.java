package com.covalense.javaapp.covalense.bean.dto;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeExperienceInfo {
	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;

}
