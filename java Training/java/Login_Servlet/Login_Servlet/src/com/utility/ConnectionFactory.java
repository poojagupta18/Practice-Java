package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory{
	
	String driverClassName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/Allianz?serverTimezone=UTC";
	String dbUser = "root";
	String dbPassword = "";
	private static ConnectionFactory connectionObj = null;
	
	
	private ConnectionFactory()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException
	{
		
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
		return conn;
	}
	
	
	public static ConnectionFactory getInstance()
	{
		if(connectionObj == null)
		{
			connectionObj = new ConnectionFactory();
			return connectionObj;
		}
		else
		{
			return connectionObj;
		}
	}

}
