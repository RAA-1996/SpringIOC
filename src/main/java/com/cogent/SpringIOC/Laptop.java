/**
 * @author: 	Richard Altamore
 * @date: 		Feb 2, 2024
 * @project:	SpringIOC
 * @file:		Laptop.java
 */
package com.cogent.SpringIOC;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.*;

public class Laptop {
	
	private int id;
	private String brand;
	private ArrayList<String> colors;
	private HashMap<Object, Object> country;
	private ArrayList<HashMap<Object, Object>> employees;
	private ArrayList<BodyManu> bodymanu;
	
	
	public Laptop() {
		System.out.println("Laptop object is created!");
	}
	
	
	public ArrayList<BodyManu> getBodymanu() {
		return bodymanu;
	}
	public void setBodymanu(ArrayList<BodyManu> bodymanu) {
		this.bodymanu = bodymanu;
	}


	public ArrayList<HashMap<Object, Object>> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<HashMap<Object, Object>> employees) {
		this.employees = employees;
	}


	public HashMap<Object, Object> getCountry() {
		return country;
	}
	public void setCountry(HashMap<Object, Object> country) {
		this.country = country;
	}


	public ArrayList<String> getColors() {
		return colors;
	}
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
