package com.day5;

class Poly1
{
	public void print()
	{
		System.out.println("Hi");
	}
}
class Poly2 extends Poly1
{
	public void print()
	{
		System.out.println("Hello");
	}
}
class Poly3 extends Poly2
{
	public void print()
	{
		System.out.println("Hey");
	}
}
public class Poly {
	public static void main(String[] args) {
		Poly1 p = new Poly3();
		p.print();
		Poly1 p1 = new Poly2();
		p1.print();
	}
}
