package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.pojo.User;
import com.service.UserDAO;
import com.utility.ConnectionFactory;


public class UserDaoImpl implements UserDAO {

	
	public Connection getConnection () throws SQLException {
		return ConnectionFactory.getInstance().getConnection();
	}
	

	@Override
	public boolean validate(User login) {
		boolean status = false;
		
		String sql = "SELECT * FROM user where username = ? and  password = ?";

		//System.out.println("Inside validate");
		
		try (Connection conn = getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);) {
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPassword());

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) 
			{
				status = true;
			}
			

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		return status;
	}


	@Override
	public boolean register(User login) {
		boolean status = false;
		
		String sql = "INSERT INTO user(name, username, password, address) VALUES(?, ?, ?, ?)";

		//System.out.println("Inside validate");
		
		try (Connection conn = getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);) {
			preparedStatement.setString(1, login.getFirstName());
			preparedStatement.setString(2, login.getUsername());
			preparedStatement.setString(3, login.getPassword());
			preparedStatement.setString(4, login.getAddress());
			
			int result = preparedStatement.executeUpdate();
			
			if(result > 0)
			{
				status = true;
			}

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		return status;
	}


	@Override
	public User search(int id) {
		
		String sql = "SELECT * FROM user where id = ?";
		User user = null;
		//System.out.println("Inside validate");
		
		try (Connection conn = getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);) {
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String name = rs.getString("name");
				int userid = rs.getInt("id");
				String address = rs.getString("address");
				
				user = new User(username, password, name, userid, address);
				
				System.out.println("User finded from :"  + user );
			}

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		return user;
	}


	

	@Override
	public boolean update(int id, HashMap<String, String> hm) {
		boolean status = false;
		
		String query1 = "UPDATE user set ";
		String query2 = "";
		
		
		  for (Map.Entry mapElement : hm.entrySet()) { 
	            String columnName = (String) mapElement.getKey(); 
	   
	            String value = (String)mapElement.getValue();  
	            query1 = query1  + query2 + columnName + " = " + "'" + value + "'";
	            query2 = " , ";
	            System.out.println(query1);     
	        } 
		
		  String sql = query1 + " where id = " + id + ";";
		  int result = 0;
		  System.out.println(sql);
		  try (Connection conn = getConnection();
			Statement  statement = conn.createStatement();) {
					
					result = statement.executeUpdate(sql);
					
					if(result > 0)
					{
						System.out.println(result);
						status = true;
					}

				} catch (SQLException e) {
					System.out.println(result);
					System.err.println(e.getMessage());
				}
		  
		return status;
	}


	@Override
	public boolean delete(int id) {
boolean status = false;
		
		String sql = "delete from user where id = ?";

		//System.out.println("Inside validate");
		
		try (Connection conn = getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);) {
			preparedStatement.setInt(1, id);

			int result = preparedStatement.executeUpdate();

			if (result > 0) {
				status = true;
			}

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
		return status;
	}

}
