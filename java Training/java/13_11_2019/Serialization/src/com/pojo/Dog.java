package com.pojo;

import java.io.Serializable;

public class Dog implements Serializable {

	String name;
	int age;
	transient int price;
	static int height = 77;
	
	public Dog(String name, int age, int price)
	{
		this.setName(name);
		this.setAge(age);
		this.setPrice(price);
		
	}
	
	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Dog.height = height;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
