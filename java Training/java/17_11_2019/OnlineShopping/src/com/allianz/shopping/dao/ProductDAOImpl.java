package com.allianz.shopping.dao;

//we can access the static members of a class directly without class name or any object. 
import static com.allianz.shopping.utility.DateUtility.convertStringToDate;

import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Product;

public class ProductDAOImpl implements ProductDAO {
	private static List<Product> productList = new ArrayList<Product>();
	
	static
	{
		productList.add(new Product(101, "colgate1", "colgate1 Tubes", 50, convertStringToDate("12/10/2019")));
		productList.add(new Product(102, "colgate2", "colgate2 Tubes", 40, convertStringToDate("12/09/2019")));
		productList.add(new Product(103, "colgate3", "colgate3 Tubes", 50, convertStringToDate("12/05/2019")));
		productList.add(new Product(104, "colgate4", "colgate4 Tubes", 60, convertStringToDate("12/10/2019")));

	}
	
	@Override
	public boolean addProduct(Product product) {
		productList.add(product);
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		if(productList != null && productList.size() > 0)
		{
			for(int i = 0; i < productList.size(); i++)
			{
				Product producttemp = productList.get(i);
				if(producttemp.getId() == product.getId())
				{
					productList.set(i, product);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		if(productList != null && productList.size()>0)
		{
			for(int i = 0; i < productList.size(); i++)
			{
				Product producttemp = productList.get(i);
				if(producttemp.getId() == id)
				{
					productList.remove(i);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productList;
	}

	@Override
	public List<Product> getAllProductsByName(String namePattern) {
		List<Product> productListTemp  = new ArrayList<Product>();
		
		if(productList != null && productList.size()>0)
		{
			for(int i = 0; i < productList.size(); i++)
			{
				Product producttemp = productList.get(i);
				if(producttemp.getDescription().toLowerCase().contains((namePattern.toLowerCase()))) //The contains() method is Java method to check if String contains another substring or not
				{
					productListTemp.add(producttemp);
				}
			}
			return productListTemp;
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByPrice(float min, float max) {
		List<Product> productListTemp = new ArrayList<Product>();
		
		if(productList != null && productList.size()>0)
		{
			for(int i = 0; i < productList.size(); i++)
			{
				Product productTemp = productList.get(i);
				
				if(productTemp.getPrice() >= min && productTemp.getPrice() <= max)
				{
					productListTemp.add(productTemp);
				}
			}
			
			return productListTemp;
		}
		return null;
	}

	@Override
	public Product getproductById(int id) {
		if(productList != null && productList.size()>0)
		{
			for(int i = 0; i < productList.size(); i++)
			{
				Product producttemp = productList.get(i);
				if(producttemp.getId() == id)
				{
					return producttemp;
				}
			}
		}
		return null;
	}



}
