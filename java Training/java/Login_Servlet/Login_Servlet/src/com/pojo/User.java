package com.pojo;


public class User {

	private String username;
	private String password;
	private String name;
	private int userid;
	private String address;
		
	public User() {
		super();
	}
	
	

	public User(String username, String password, String name, String address) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
	}



	public User(String username, String password, String name, int userid, String address) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.userid = userid;
		this.address = address;
	}



	public User(String username, String password) {
		super();
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return name;
	}

	public void setFirstName(String firstName) {
		this.name = firstName;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name 
				+ ", address=" + address + "]";
	}
	
	
}
