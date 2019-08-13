package com.covalense.empspring.dao;

import java.util.List;

import com.covalense.empspring.beans.EmployeeInfo;



public interface EmployeeDAO {
	List<EmployeeInfo> getAllEmployeeInfo();
	boolean saveOrUpdate(EmployeeInfo bean);
	EmployeeInfo getEmployeeInfo(String id);

	EmployeeInfo getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfo empInfo);

	//boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
	//boolean createEmployeeInfo(EmployeeInfo bean);
	//boolean saveOrUpdate(EmployeeInfo bean);
	List<Integer> getAllEmployeeIds(String id);
	List<String> getAllEmployeeNames(String id);
	boolean updateEmployeeInfo(EmployeeInfo bean);
	
	

}
