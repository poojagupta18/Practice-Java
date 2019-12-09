package com.allianz.shopping.model;

import java.util.Date;

public class Product {

	private int id;
	private String code;
	private String description;
	private float price;
	private Date manifDate;
	
	/*
	 * public Product(int id, String code, String description, float price) {
	 * super(); this.id = id; this.code = code; this.description = description;
	 * this.price = price; }
	 */
	
	
	
	public Product(int id, String code, String description, float price, Date manifDate) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
		this.manifDate = manifDate;
	}



	public Product() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	public Date getManifDate() {
		return manifDate;
	}


	public void setManifDate(Date manifDate) {
		this.manifDate = manifDate;
	}
	
	
}
