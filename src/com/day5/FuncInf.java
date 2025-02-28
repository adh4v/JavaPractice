package com.day5;

interface F1
{
	void greet();
	default void gun()
	{
		System.out.println("Gun");
	}
	static void sun()
	{
		System.out.println("Sun");
	}
}
public class FuncInf {
	public static void main(String[] args) {
		F1 f=new F1()
		{
			@Override
	  		public void greet()
	  		{
	  			System.out.println("gREET");
	  		}
		};
		f.greet();
		new F1()
		{
			public void greet()
			{
				System.out.println("Greet");
			}
		}.greet();
		F1 f1 = ()->System.out.println("Hello");
		f1.greet();
		f.gun();
	}
}