package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection cn;
	private static final String DB_DriverClass = "com.mysql.cj.jdbc.Driver";
	private static final String DB_Url = "jdbc:mysql://localhost:3306/test";
	private static final String DB_UserName = "root";
	private static final String DB_Password = "321@rahsuT";

	public static Connection getConnection() {

		try {
			// step1:
			Class.forName(DB_DriverClass);
			System.out.println("Driver loaded successfully...");

			// step2:
			// connect database
			cn = DriverManager.getConnection(DB_Url, DB_UserName, DB_Password);
			System.out.println("Connection established successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}
