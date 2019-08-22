package com.covalense.librarymanagementsystem.controller;

import java.util.List;

import com.covalense.librarymanagementsystem.beans.BookDetailsBean;

import lombok.Data;

@Data
public class BookResponse {
	
	private int statusCode;
	
	private String message;
	
	private String description;
		
	public List<BookDetailsBean> bookDetailsBeans; 
}
