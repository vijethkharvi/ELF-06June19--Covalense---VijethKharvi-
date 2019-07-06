package com.covalense.javaapp.covalense.bean.dto;

import java.util.Date;

import lombok.Data;
@Data
public class EmploteeEduInfo {
	private int id;
	private String educationType;
	private String degreeType;
	private String branch;
	private String collegeName;
	private String university;
	private Date yop;
	private double percentage;
	private String location;

}
