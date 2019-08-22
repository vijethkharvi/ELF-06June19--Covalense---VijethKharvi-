package com.covalense.librarymanagementsystem.controller;

import java.util.List;

import com.covalense.librarymanagementsystem.beans.UserDetailsBean;

import lombok.Data;

@Data
public class Response {
	
	private int statusCode;
	
	private String message;
	
	private String description;
	
	private UserDetailsBean userDetailsBean;
	
	private List<UserDetailsBean> userDetailsBeans;
}
