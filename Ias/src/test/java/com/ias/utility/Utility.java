package com.ias.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static String fetchPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\config.properties");
		Properties property = new Properties();
		property.load(fis);
		return property.get(key).toString();
	}
}
