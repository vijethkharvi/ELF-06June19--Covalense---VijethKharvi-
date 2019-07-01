package com.covaslense.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJdbcProgram {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. load the "Driver"
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// 2. get the db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			// 3.issue "sql querrys" via "connection
			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4."process the results" returning by "sql querrys"
			while (rs.next()) {

				log.info("id            =====>" + rs.getInt("ID"));
				log.info("name          =====>" + rs.getString("NAME"));
				log.info("age           =====>" + rs.getInt("AGE"));
				log.info("gender        =====>" + rs.getString("GENDER"));
				log.info("salary        =====>" + rs.getDouble("SALARY"));
				log.info("phone         =====>" + rs.getLong("PHONE"));
				log.info("joining_date  =====>" + rs.getDate("JOINING_DATE"));
				log.info("acount_number =====>" + rs.getLong("ACOUNT_NUMBER"));
				log.info("email         =====>" + rs.getString("email"));
				log.info("designation   =====>" + rs.getString("designation"));
				log.info("dob           =====>" + rs.getDate("dob"));
				log.info("Dept_id       =====>" + rs.getInt("Dept_id"));
				log.info("manager_id    =====>" + rs.getInt("manager_id"));

			}

		} catch (SQLException e) {
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

	}

}// end of class
