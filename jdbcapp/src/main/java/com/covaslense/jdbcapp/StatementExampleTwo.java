package com.covaslense.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class StatementExampleTwo {
	public static void main(String[] args) {

		StatementExampleTwo ref = new StatementExampleTwo();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 1. load the "Driver"
		/*
		 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
		 * DriverManager.registerDriver(driver);
		 * 
		 */
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. get the db connection via driver
			/*
			 * String dbUrl =
			 * "jdbc:mysql://192:168:43:75:3306/techchefs?user=root&password=root"; con =
			 * DriverManager.getConnection(dbUrl);
			 */
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			log.info("connection impl class====>" + con.getClass());

			// 3.issue "sql querrys" via "connection
			String query = "insert into employee_info values(1007,'mankutimma',54,'male',90000,9900899898,'2000-08-15',7363636363,'manku@gmail.com','software engineer','2019-01-01',107,7)";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			log.info("" + result);

			/*
			 * // 4."process the results" returning by "sql querrys" while (rs.next()) {
			 * 
			 * log.info("id            =====>" + rs.getInt("ID"));
			 * log.info("name          =====>" + rs.getString("NAME"));
			 * log.info("age           =====>" + rs.getInt("AGE"));
			 * log.info("gender        =====>" + rs.getString("GENDER"));
			 * log.info("salary        =====>" + rs.getDouble("SALARY"));
			 * log.info("phone         =====>" + rs.getLong("PHONE"));
			 * log.info("joining_date  =====>" + rs.getDate("JOINING_DATE"));
			 * log.info("acount_number =====>" + rs.getLong("ACOUNT_NUMBER"));
			 * log.info("email         =====>" + rs.getString("email"));
			 * log.info("designation   =====>" + rs.getString("designation"));
			 * log.info("dob           =====>" + rs.getDate("dob"));
			 * log.info("Dept_id       =====>" + rs.getInt("Dept_id"));
			 * log.info("manager_id    =====>" + rs.getInt("manager_id"));
			 * 
			 * }
			 */

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

	}

}// end of class
