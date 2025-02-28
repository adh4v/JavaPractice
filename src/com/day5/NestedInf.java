package com.day5;

interface Ninf1
{
	void sum();
	interface Ninf3
	{
		void mul();
	}
}
class Ninf2 implements Ninf1.Ninf3
{
	public void mul()
	{
		System.out.println("THIS");
	}
}
public class NestedInf {
	public static void main(String[] args) {
		
	}
}
