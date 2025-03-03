package com.day6;

public class AgeValide
{
	public void checkAge(int age) throws Exception
	{
		if(age >= 18)
		{
			ValidAge va = new ValidAge("Eligible");
			throw(va);
		}
	}
}
