package com.te.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteInPropertiesFile {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("dbinfo.properties");

			Properties properties = new Properties();

			properties.setProperty("user", "root");
			properties.setProperty("password", "root");
			properties.setProperty("dbUrl", "jdbc:mysql://localhost:3306/technoelevate");
			properties.setProperty("driver", "com.mysql.jdbc.Driver");

			properties.store(fileOutputStream, "DB information");
			System.out.println("file Writed sucessfully");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
