package com.covalense.lms.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.covalense.lms.dto.LibraryResponse;
import com.covalense.lms.dto.UserRegisterBean;
@Service

public interface UserDAO {

	public LibraryResponse updateUser(UserRegisterBean bean);

	public LibraryResponse createUser(UserRegisterBean bean);

	public LibraryResponse getUser(int id, HttpServletRequest request);


	public LibraryResponse getAllUser(HttpServletRequest request);

	public LibraryResponse deleteUser(int id, HttpServletRequest request);

	public LibraryResponse getSearch(String userName, HttpServletRequest request);

}
