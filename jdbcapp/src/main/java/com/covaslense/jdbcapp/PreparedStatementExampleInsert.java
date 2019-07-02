package com.covaslense.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExampleInsert {
	public static void main(String[] args) {

		PreparedStatementExampleInsert ref = new PreparedStatementExampleInsert();

		Connection con = null;
		PreparedStatement stmt = null;
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

			String query = "insert into employee_info(id,name,age,gender,salary,phone,joining_date,Dept_id) values(?,?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setString(4, args[3]);
			stmt.setDouble(5, Double.parseDouble(args[4]));
			stmt.setLong(6, Long.parseLong(args[5]));
			stmt.setString(7, args[6]);
			stmt.setInt(8, Integer.parseInt(args[7]));

			int res = stmt.executeUpdate();
			log.info("" + res);

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
