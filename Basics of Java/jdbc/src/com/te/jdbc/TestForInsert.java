package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestForInsert {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			// step 1
			Class.forName("com.mysql.jdbc.Driver");

			// step 2
			String dburl = "jdbc:mysql://localhost:3306/technoelevate?useSSL=false";
			connection = DriverManager.getConnection(dburl, "root", "root");
			

			// step 3
			String querry = "insert into interns values "
					+"('paul',300,'1997-08-09','M','JFSD',7384987374,78000,30,'O+','paul@gmail.com')";
			
			String querry2 ="update interns set blood_group ='O+' where id =300";
			

			statement = connection.createStatement();

			int result = statement.executeUpdate(querry2);

			// step 4

			System.out.println(result + " No of records inserted");

		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			try {

				if (connection != null) {

					connection.close();

				}
				if (statement != null) {

					statement.close();
				}
			} catch (Exception e) {

			}

		}

	}

}
