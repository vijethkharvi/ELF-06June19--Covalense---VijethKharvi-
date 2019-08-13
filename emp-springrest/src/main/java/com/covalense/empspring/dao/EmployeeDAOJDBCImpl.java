package com.covalense.empspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.covalense.empspring.beans.EmployeeInfo;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfo> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "password");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfo> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfo bean = new EmployeeInfo();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				//bean.setAccountNumber(rs.getLong("ACCOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
			//	bean.setDepartmentId(rs.getInt("DEPT_ID"));
				//bean.setMngrId(rs.getInt("MNGR_ID"));
				
				beans.add(bean);

			} // End of while
			return beans;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} // End of try-catch
	}// End of main

	public EmployeeInfo getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// End of getEmployeeInfo(String id)

	public EmployeeInfo getEmployeeInfo(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";

			con = DriverManager.getConnection(dbUrl, "root", "password");

			String query = "select * from employee_info" + " where id=?";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			EmployeeInfo bean = new EmployeeInfo();

			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
			//	bean.setAccountNumber(rs.getLong("ACCOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
			//	bean.setDepartmentId(rs.getInt("DEPT_ID"));
				//bean.setManagerId(rs.getInt("MNGR_ID"));

			} // End of while;

			return bean;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} // End of Try-Catch block
		}
	}// End of getEmployeeInfo(int id)

	@Override
	public boolean createEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*@Override
	public boolean saveOrUpdate(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
*/
	/*@Override
	public boolean createEmployeeOtherInfo(EmployeeOtherInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}*/

	/*@Override
	public boolean saveOrUpdate(EmployeeOtherInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}*/

	
	 

	@Override
	public List<String> getAllEmployeeNames(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> getAllEmployeeIds(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveOrUpdate(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	/*@Override
	public boolean createEmployeeInfo(EmployeeInfo empInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}*/

	/*
	 * @Override public List<Integer> getAllEmployeeIds(int id) { // TODO
	 * Auto-generated method stub return null; }
	 */
}// End of class
