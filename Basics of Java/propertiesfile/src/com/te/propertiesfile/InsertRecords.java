package com.te.propertiesfile;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertRecords {
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			fileInputStream = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Class.forName(properties.getProperty("driver"));

			connection = DriverManager.getConnection(properties.getProperty("dbUrl"),properties);
			String querry = "insert into interns values(?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(querry);
			
			preparedStatement.setString(1, args[0]);
			preparedStatement.setInt(2, Integer.parseInt(args[1]));
			preparedStatement.setDate(3, Date.valueOf(args[2]));
			preparedStatement.setString(4, args[3]);
			preparedStatement.setString(5, args[4]);
			preparedStatement.setLong(6, Long.parseLong(args[5]));
			preparedStatement.setDouble(7, Double.parseDouble(args[6]));
			preparedStatement.setInt(8, Integer.parseInt(args[7]));
			preparedStatement.setString(9, args[8]);
			preparedStatement.setString(10, args[9]);

			int res = preparedStatement.executeUpdate();

			if (res == 1) {
				System.out.println("Data sucessfully inserted");
			}

		} catch (Exception e) {

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
