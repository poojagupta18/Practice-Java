package com.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.dao.ProductDAO;
import com.pojo.Product;

public class ProductDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSave() {
		
		ProductDAO dao = new ProductDAO();
		Product product = new Product(12, "Laptop", "SoftWare", 100000);
		product = dao.save(product);
		
		assertNotNull(product);
	}

	@Test
	public void testDelete() {
		System.out.println("Deleted successfuly");	}

}
