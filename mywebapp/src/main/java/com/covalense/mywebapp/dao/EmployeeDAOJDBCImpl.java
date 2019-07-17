package com.covalense.mywebapp.dao;

import java.sql.*;
import java.util.ArrayList;

import com.covalense.mywebapp.beans.DeptInfoBean;
import com.covalense.mywebapp.beans.EmployyeBeanJava;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOJDBCImpl implements EmployeeDAO {
	public ArrayList<EmployyeBeanJava> getAllEmployeeInfo() {
		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";

		// 1. load the "Driver"
		/*
		 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
		 * DriverManager.registerDriver(driver);
		 * 
		 */
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. get the db connection via driver
			/*
			 * String dbUrl =
			 * "jdbc:mysql://192:168:43:75:3306/techchefs?user=root&password=root"; con =
			 * DriverManager.getConnection(dbUrl);
			 */

			log.info("connection impl class====>" + con.getClass());

			// 3.issue "sql querrys" via "connection

			// 4."process the results" returning by "sql querrys"
			ArrayList<EmployyeBeanJava> beans = new ArrayList<>();
			while (rs.next()) {
				EmployyeBeanJava bean = new EmployyeBeanJava();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccno(rs.getLong("ACOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANGR_ID"));

				beans.add(bean);//

			}
			return beans;

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployyeBeanJava getEmployeeInfo(String id) {
		try {
			getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;
	}// end of getEmployeeInfo(string)

	public EmployyeBeanJava getEmployeeInfo(int id) {
		Connection con = null;
		String query = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. get the db connection via driver

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			// 3.issue "sql querrys" via "connection
			query = "select * from employee_info where id=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			EmployyeBeanJava bean = new EmployyeBeanJava();

			// 4."process the results" returning by "sql querrys"
			while (rs.next()) {

				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setPhone(rs.getLong("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccno(rs.getLong("ACOUNT_NUMBER"));
				bean.setEmail(rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANGR_ID"));

			}

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.close all "jdbc objects"
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;

	}// end of getEmployee

	@Override
	public boolean createEmployeeInfo(EmployyeBeanJava bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployyeBeanJava bean) {
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

	@Override
	public EmployyeBeanJava setEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createDeptInfoBean(DeptInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}


}// end of class
