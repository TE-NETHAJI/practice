package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestForDeleteOperation {
	public static void main(String[] args) {

		String dburl = "jdbc:mysql://localhost:3306/technoelevate?useSSL=false";
		try (Connection connection = DriverManager.getConnection(dburl, "root", "root");
				Statement statement = connection.createStatement()) {
			// step 1
			Class.forName("com.mysql.jdbc.Driver");

			// step 3
			String querry = "delete from interns where id =300 ";

			int result = statement.executeUpdate(querry);
			

			// step 4

			System.out.println(result + " No of records afftected");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Deletion sucessfully");

		}

	}

}
