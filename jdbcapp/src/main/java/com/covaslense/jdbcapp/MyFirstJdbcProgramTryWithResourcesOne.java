package com.covaslense.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class MyFirstJdbcProgramTryWithResourcesOne {
	public static void main(String[] args) {
		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		
		MyFirstJdbcProgramTryWithResourcesOne ref = new MyFirstJdbcProgramTryWithResourcesOne();


				// 1. load the "Driver"
		/*
		 * java.sql.Driver driver = new com.mysql.jdbc.Driver();
		 * DriverManager.registerDriver(driver);
		 * 
		 */
		try (Connection con =DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt =con.createStatement();
				ResultSet rs = stmt.executeQuery(query);){

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
			while (rs.next()) {

				/*log.info("id            =====>" + rs.getInt("ID"));
				log.info("name          =====>" + rs.getString("NAME"));*/
				log.info("id            =====>" + rs.getInt(1));
				log.info("name          =====>" + rs.getString(2));
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

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} /*finally {
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
		}*/

	}//end of main

}// end of class
