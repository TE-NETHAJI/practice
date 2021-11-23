package com.te.employeedatabaseproject.connection;

public class ConnectionDatabase {

	private static ConnectionDatabase single_instance = null;

	private ConnectionDatabase() {

	}

	public static ConnectionDatabase getInstance() {
		if (single_instance == null) {
			single_instance = new ConnectionDatabase();
		}
		return single_instance;

	}

}
