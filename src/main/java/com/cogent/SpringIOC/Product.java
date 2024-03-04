/**
 * @author: 	Richard Altamore
 * @date: 		Feb 2, 2024
 * @project:	SpringIOC
 * @file:		Product.java
 */
package com.cogent.SpringIOC;

public class Product {
	
	private int id;
	private String name;
	private float price;
	private Laptop laptop;
	private String[] rams;
	
	
	public Product() {
		System.out.println("Object is created!");
	}
	
	
	public String[] getRams() {
		return rams;
	}
	public void setRams(String[] rams) {
		this.rams = rams;
	}


	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

	
	
		
}
