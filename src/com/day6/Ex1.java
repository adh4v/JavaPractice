package com.day6;

class Dog
{
	public Dog()
	{
		System.out.println("Default");
	}
	public Dog(String msg)
	{
		System.out.println("Single"+msg);
	}
}
class Fox extends Dog
{
	public Fox()
	{
		super();
		System.out.println("Fox");
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Fox o = new Fox();
	}
}
