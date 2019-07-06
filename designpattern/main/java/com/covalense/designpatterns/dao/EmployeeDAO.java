package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import com.covalense.designpatter.beans.EmployyeBeanJava;

public interface EmployeeDAO {
	ArrayList<EmployyeBeanJava> getAllEmployeeInfo();

	EmployyeBeanJava getEmployeeInfo(String id);

	EmployyeBeanJava getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployyeBeanJava bean);

	boolean updateEmployeeInfo(EmployyeBeanJava bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
	
}
