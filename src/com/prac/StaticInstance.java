package com.prac;

public class StaticInstance {
	int id=10;
	static int ui=0;
	public void dog()
	{
		System.out.println(id);
		System.out.println(StaticInstance.ui);
	}
	public static void cat()
	{
		System.out.println(ui);
		StaticInstance s=new StaticInstance();
		System.out.println(s.id);
	}
	public static void main(String[] args)
	{
		StaticInstance o=new StaticInstance();
		o.dog();
		cat();
	}
}
