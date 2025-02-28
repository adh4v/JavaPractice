package com.day5;

interface Inter 
{
	void dog();
	void cat();
}
abstract class Abc
{
	void bawf()
	{
		System.out.println("Bow Bow");
	}
	abstract void meow();
}
class Impl extends Abc implements Inter
{
	public void dog()
	{
		System.out.println("bawf Bawf");
	}
	public void cat()
	{
		System.out.println("Meow Meow");
	}
	public void meow()
	{
		System.out.println("Meow MEow Meow");
	}
}
public class Inf
{
	public static void main(String[] args) {
		Impl i=new Impl();
		i.cat();
		i.dog();
		i.meow();
		i.bawf();
	}
	
}
