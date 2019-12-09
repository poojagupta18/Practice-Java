package com.service;

import java.util.HashMap;

import com.pojo.User;

public interface UserDAO {

	boolean validate(User user);
	boolean register(User user);
	User search(int id);
	boolean update(int id, HashMap<String, String> hm);
	boolean delete(int id);
	
}
