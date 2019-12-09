package com.allianz.shopping.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productId")
	private Integer productId;
	
	@Column(name="productCode")
	private String productCode;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="manfDate")
	private Date manfDate;
	//private List<Category> categoryList = new ArrayList<Category>();
	

	public Product() {
		
	}

	/*
	 * public List<Category> getCategoryList() { return categoryList; }
	 * 
	 * public void setCategoryList(List<Category> categoryList) { this.categoryList
	 * = categoryList; }
	 */

	public int getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getManfDate() {
		return manfDate;
	}

	public void setManfDate(Date manfDate) {
		this.manfDate = manfDate;
	}


	public Product(Integer productId, String productCode, String description, Float price, Date manfDate) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		this.manfDate = manfDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", description=" + description
				+ ", price=" + price + ", manfDate=" + manfDate + "]";
	}

}
