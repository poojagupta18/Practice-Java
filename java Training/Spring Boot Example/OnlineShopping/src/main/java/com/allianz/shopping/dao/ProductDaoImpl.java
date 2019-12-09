package com.allianz.shopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allianz.shopping.model.Product;
import com.allianz.shopping.model.Product1;

/*
 * public interface ProductDaoImpl extends JpaRepository<Product, Integer> {
 * 
 * // public List<Product> getAllProductByProductCode(String productCode); }
 */

public interface ProductDaoImpl extends JpaRepository<Product, Integer> {

//	public List<Product> getAllProductByProductCode(String productCode);
}
