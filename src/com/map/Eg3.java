package com.map;

import java.util.*;
import java.util.Map.Entry;

class Customer
{
	private int id;
	private String name;
	private String city;
	private int age;
	public Customer()
	{
		
	}
	public Customer(int id, String name, String city, int age) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
}
public class Eg3 {
	public static void main(String[] args) {
		HashMap<Customer,String> hm = new HashMap<>();
		hm.put(new Customer(101,"Adhav","Cbe",21), "Customer 1");
		hm.put(new Customer(121,"Abi","Slm",20), "Customer 4");
		hm.put(new Customer(112,"Zoro","Erd",15), "Customer 6");
		hm.put(new Customer(111,"Aki","Erd",17), "Customer 3");
		hm.put(new Customer(114,"Sora","Cbe",15), "Customer 2");
		hm.put(new Customer(118,"Ava","Trk",23), "Customer 8");
		hm.put(new Customer(119,"Alan","Cbe",28), "Customer 11");	
		System.out.println(hm);
		Iterator<Entry<Customer,String>> itr = hm.entrySet().iterator();
		System.out.println();
		while(itr.hasNext())
		{
			Entry<Customer, String> e = itr.next();
			System.out.println(e.getKey()+" -> "+e.getValue());
		}
	}

}
