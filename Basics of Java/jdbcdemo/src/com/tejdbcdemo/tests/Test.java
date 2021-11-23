package com.tejdbcdemo.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {

			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// give connection via driver
			String url = "jdbc:mysql://localhost:3306/technoelevate";
			connection = DriverManager.getConnection(url, "root", "root");

			// issue sql querry via connection
			@SuppressWarnings("unused")
			String querry = "select * from interns";
			String deleteQuerry = "delete from interns where id=30";
			@SuppressWarnings("unused")
			String updateQuerry = "update interns set name='payal' where id =30 ";
			@SuppressWarnings("unused")
			String insertQuerry = "insert into interns values()";// column name in order
			statement = connection.createStatement();
			
			//process the results from sql querry
			int mod = statement.executeUpdate(deleteQuerry);
			// rs = statement.executeQuery(querry);

			/*
			 * int i = 0;
			 * 
			 * while (rs.next()) { System.out.println("==================================");
			 * System.out.println(++i); System.out.println("Name:" + rs.getString("name"));
			 * System.out.println("ID:" + rs.getString("id"));
			 * 
			 * System.out.println("===================================="); }
			 */

			System.out.println("records affected " + mod);
			
			//close all jdbc objects
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
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
