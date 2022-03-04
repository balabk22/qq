package com;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private static Connection con;

	public static Connection getConnection() {

		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream input = classLoader.getResourceAsStream("db.properties");
			Properties props = new Properties();
			props.load(input);

			if (con == null) {
				Class.forName(props.getProperty("db-driver"));
				con = DriverManager.getConnection(props.getProperty("db-url"), props.getProperty("db-user"),
						props.getProperty("db-password"));
				return con;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}