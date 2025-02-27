package com.prac;

import java.util.Scanner;

class Order {
	private int id;
	private String name;
	private int price;
	private int qty;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
}
public class Boxing
{
	public static void main(String[] args) {
		Order b=new Order();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		b.setId(id);
		String name=sc.next();
		b.setName(name);
		int setPrice = sc.nextInt();
		b.setPrice(setPrice);
		int qty=sc.nextInt();
		b.setQty(qty);
		System.out.println(b.getId()+"\n"+b.getName()+"\n"+b.getPrice()+"\n"+b.getQty()+"\n"+b.getQty());
	}
}
