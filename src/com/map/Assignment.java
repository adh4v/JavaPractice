package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Order
{
	private int o_id;
	private String o_name;
	private String category;
	private double price;
	private int quantity;
	private int year;
	private String month;
	private String city;
	public Order()
	{
	}
	public Order(int o_id, String o_name, String category, double price, int quantity, int year, String month,
			String city) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.year = year;
		this.month = month;
		this.city = city;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_name=" + o_name + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + ", year=" + year + ", month=" + month + ", city=" + city + "]";
	}
}
public class Assignment {
	//1.Highest order in a Year
	public static void getHighestOrderInYear(List<Order> o)
	{
		
	}
	public static void main(String[] args) {
		List<Order> l = new ArrayList<>();
		
		l.add(new Order(101,"Ken","Milk",200,10,2021,"April","Erode"));
		l.add(new Order(112,"Shanks","Electronics",300,3,2022,"May","Cbe"));
		l.add(new Order(102,"Mihawk","Milk",250,14,2021,"June","Salem"));
		l.add(new Order(107,"Zoro","Fruits",380,15,2024,"July","Trichy"));
		l.add(new Order(106,"Sora","Veggies",458,6,2025,"January","Tuticorin"));
		l.add(new Order(110,"Gojo","Drinks",600,4,2024,"June","Erode"));
		l.add(new Order(121,"Luffy","Sweets",875,7,2023,"November","Cbe"));
		l.add(new Order(125,"Ippo","Drinks",370,3,2023,"December","Chennai"));
		l.add(new Order(123,"Maki","Fruits",290,5,2023,"June","Tirupur"));
		l.add(new Order(115,"Kaneki","Electronics",600,3,2024,"May","Erode"));
	}

}
