package com.day5;

interface L1
{
	void greet(int id, String name);
}

public class Lambda {
	public static void main(String[] args) {
		L1 l = (id,name) ->{
			System.out.println(id+" "+name);
			
		};
		l.greet(1, "Adhav");
	}
}
