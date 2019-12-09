package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dao.UserDAO;
import com.pojo.User;

public class UserDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSave() {
		UserDAO dao = new UserDAO();
		User user = new User(20, "Atul", "Pune", "999999999");
		user = dao.save(user);
	
		assertNotNull(user);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
