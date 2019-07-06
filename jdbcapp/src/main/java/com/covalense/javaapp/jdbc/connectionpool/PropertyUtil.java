package com.covalense.javaapp.jdbc.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
private static PropertyUtil getPropertyUtil() {
private static PropertyUtil=null;
Properties properties=null;

public static PropertyUtil getPropertyUtil()  {
	if(util==null) {
		util=new PropertyUtil();
	}return util;
}
private PropertyUtil() {
	properties=new Properties();
	properties.load(new FileInputStream("db.properties"));
	
}
public String getProperty(String key) {
	return
	
}

	}
}
