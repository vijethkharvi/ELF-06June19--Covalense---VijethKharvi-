package com.covalense.javaapp.jdbc.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	private static PropertyUtil propUtil = null;
	Properties properties = null;

	public static PropertyUtil getPropertyUtil() {
		if (propUtil == null) {
			return new PropertyUtil();
		}
		return propUtil;
	}

	private PropertyUtil() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("db.properties"));

	}

	public String getProperty(String key) {
		return properties.getProperty(key);

	}

}
