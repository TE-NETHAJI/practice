package com.te.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectDynamicQuerry {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			fileInputStream = new FileInputStream("dbinfo.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);

			Class.forName(prop.getProperty("driver"));

			connection = DriverManager.getConnection(prop.getProperty("dbUrl"), prop);

			String querry = "select * from interns where id =?";
			preparedStatement = connection.prepareStatement(querry);
			preparedStatement.setInt(1, Integer.parseInt(args[1]));
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				System.out.println("Name  :" + resultSet.getString("name"));
				System.out.println("Id    :" + resultSet.getInt("id"));
				System.out.println("DOB   :" + resultSet.getDate("dob"));
				System.out.println("Email :" + resultSet.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (connection != null) {

					connection.close();

				}
				if (preparedStatement != null) {

					preparedStatement.close();
				}

				if (resultSet != null) {

					resultSet.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
