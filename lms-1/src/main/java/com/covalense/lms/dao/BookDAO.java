package com.covalense.lms.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.covalense.lms.dto.BookDetailsBean;
import com.covalense.lms.dto.LibraryResponse;
@Service
public interface BookDAO {
	public LibraryResponse createBook( BookDetailsBean bean);
	public LibraryResponse updateBook(BookDetailsBean bean);
	public LibraryResponse getBook( int id,HttpServletRequest request);
	public LibraryResponse searchBook(String name,HttpServletRequest request);
	public LibraryResponse getAllBook(HttpServletRequest request);
	public LibraryResponse deleteBook(int id, HttpServletRequest request);
}
