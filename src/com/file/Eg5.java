package com.file;

import java.io.Serializable;

public class Eg5 implements Serializable {
	private static final long serialversionUID = 1L; 
	private int id;
	private String name;
	private String city;
	volatile transient int pincode;
	public Eg5()
	{
		
	}
	public Eg5(int id, String name, String city, int pincode) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pincode = pincode;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Eg5[id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
