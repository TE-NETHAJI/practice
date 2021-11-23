package com.te.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) {

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);

			System.out.println(properties.getProperty("user"));
			System.out.println(properties.getProperty("password"));
			System.out.println(properties.getProperty("dbUrl"));
			System.out.println(properties.getProperty("driver"));

		} catch (Exception e) { 
			e.printStackTrace();
		}

	}
}
