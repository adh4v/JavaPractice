package com.day5;

class Stat
{
	int pin=100;
	static int id=10;
	static class InnerCls1
	{
		void disp()
		{
			System.out.println("Hello");
		}
	}
	class InnerCls2
	{
		void dis()
		{
			System.out.println("Hi");
		}
	}
}
public class StaticCls {
	public static void main(String[] args) {
		Stat.InnerCls1 s=new Stat.InnerCls1();
		s.disp();
		Stat s1 = new Stat();
		Stat.InnerCls2 s2=s1.new InnerCls2(); 
		
	}
}
