package com.day5;

class A {
	int a=10;
	public void Disp()
	{
		System.out.println("Ten");
	}
}
class B extends A
{
	public void Dis()
	{
		System.out.println(a);
	}
}
class SingleInh
{
	public static void main(String[] args)
	{
		B b=new B();
		b.Disp();
		b.Dis();
	}
}
