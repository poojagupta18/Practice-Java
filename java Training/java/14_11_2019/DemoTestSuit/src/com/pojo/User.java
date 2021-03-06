package com.pojo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.dao.ProductDAO;

public class User {

	int userId;
	String name;
	String address;
	String contact;
	
	public User(int userId, String name, String address, String contact) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
	
	
	
}
