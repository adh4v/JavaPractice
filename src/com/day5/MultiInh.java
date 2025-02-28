package com.day5;

class C
{
	int a=10;
	public void display()
	{
		System.out.println(a);
	}
}
class D extends C
{
	int b=20;
	public void dis()
	{
		System.out.println(a);
	}
}
class E extends D
{
	public void disp()
	{
		System.out.println(b);
	}
}
public class MultiInh {
	public static void main(String[] args) {
		E e=new E();
		e.disp();
		e.dis();
		C c=e;
		c.display();
	}

}
