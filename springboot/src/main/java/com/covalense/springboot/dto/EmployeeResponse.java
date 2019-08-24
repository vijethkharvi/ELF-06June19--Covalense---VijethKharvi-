package com.covalense.springboot.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@JsonRootName("employee-response")
@Component
public class EmployeeResponse {
	@JsonProperty("status-code")
	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeInfoBean> beans;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<EmployeeInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmployeeInfoBean> beans) {
		this.beans = beans;
	}
	
	
}
