package com.covalense.javaapp.jdbc.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

public class ConnectionPool {
	private Vector<Connection> pool = null;
	private int poolsize = 10;
	private String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
	private String userNM = "root";
	private String password = "root";
	private Connection con = null;
	private String driverClassNM = "com.mysql.jdbc.Driver";
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectioPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private void loadProperties() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
		
		poolsize=Integer.parseInt(properties.getProperty("poolSize"));
		dbUrl=properties.getProperty("dbUrl");
		userNM=properties.getProperty("userNM");
		password=properties.getProperty("password");
		driverClassNM=properties.getProperty("driverClass");

	}

	private ConnectionPool() throws Exception {
		Class.forName(driverClassNM);

		for (int i = 0; i < poolsize; i++) {
			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);
		} // end of for
	}// end of constructor

	public Connection getConnectionFromPool() {

		return pool.remove(0);

	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
}// end of class
