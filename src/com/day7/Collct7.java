package com.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer //implements Comparable<Customer>
{
	private int id;
	private String name;
	public Customer()
	{
		
	}
	public Customer(int id, String name)
	{
		this.id=id;
		this.name=name;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Customer o) {
//		return this.id-o.id;
//	}
	
}
public class Collct7 {
	public static void main(String[] args) {
		List<Customer>l=new ArrayList<>();
		l.add(new Customer(1,"Adhav"));
		l.add(new Customer(4,"Gojo"));
		l.add(new Customer(2,"Zoro"));
		l.add(new Customer(5, "Aki"));
		l.add(new Customer(3,"Sora"));
		l.add(new Customer(9,"Reyna"));
		//Collections.sort(l);
		l.forEach(lst->System.out.println(lst.getId()+" "+lst.getName()+" "));
		System.out.println();
		
		//USING STREAM API PRINT NAMES WITH STARTING CHAR
	
		l.stream().filter(la->la.getName().startsWith("A")).forEach(lt->System.out.println(lt));;
		
		//USING STREAM API SORTING CUST DATA
		
		l.stream().sorted(Comparator.comparing(Customer :: getId)).forEach(a->System.out.println(a.getId()+" "+a.getName()));
		List<Customer>list = l.stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
		list.forEach(lx->System.out.println("Id : "+lx.getId()+" "+"Name : "+lx.getName()));
		
		
		
	}
}
