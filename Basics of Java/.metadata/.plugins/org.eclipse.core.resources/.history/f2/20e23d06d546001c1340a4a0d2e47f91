package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test {
	public static void main(String[] args) {

		/*
		 * Driver driver; try { // step 1 - load the driver driver = new Driver();
		 * DriverManager.registerDriver(driver); } catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 */
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.driver loaded");

			// step 2 get db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/technoelevate" + "?user=root&password=root&useSSL=false";
			connection = DriverManager.getConnection(dbUrl);
			System.out.println("2.connetion established");

			// step 3 issue sequel queries via connection
			String querry = "select * from interns";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(querry);

			// step 4 process the result from sequel queries
			int i = 0;
			while (resultSet.next()) {

				System.out.println("---------------" + ++i + "------------");
				System.out.println("Name  :" + resultSet.getString("name"));
				System.out.println("Id    :" + resultSet.getInt("id"));
				System.out.println("DOB   :" + resultSet.getDate("dob"));
				System.out.println("Email :" + resultSet.getString("email"));

				System.out.println("-------------------------------");

			}

			// step 5 close all jdbc objects

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {

				if (connection != null) {

					connection.close();

				}
				if (statement != null) {

					statement.close();
				}

				if (resultSet != null) {

					resultSet.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
