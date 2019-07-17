package com.covalense.mywebapp.dao;

/*import java.util.ArrayList;
*/import java.util.List;

import com.covalense.mywebapp.beans.DeptInfoBean;
import com.covalense.mywebapp.beans.EmployyeBeanJava;



public interface EmployeeDAO {
	List<EmployyeBeanJava> getAllEmployeeInfo();

	EmployyeBeanJava setEmployeeInfo(String id);

	EmployyeBeanJava getEmployeeInfo(String idValue);

	boolean createEmployeeInfo(EmployyeBeanJava bean);

	boolean updateEmployeeInfo(EmployyeBeanJava bean);

	boolean deleteEmployeeInfo(int id);
                            
	boolean deleteEmployeeInfo(String id);

	boolean createDeptInfoBean(DeptInfoBean bean);


	
	
}
