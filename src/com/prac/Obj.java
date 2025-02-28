package com.prac;

public class Obj {
	int a=10;
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println(a);
	}
	public void disp()
	{
		System.out.println(a++);
	}
	public static Obj getInstance()
	{
		return new Obj();
	}
	public static void main(String[] args)
	{
		Obj o = Obj.getInstance();
		o.disp();	
		o=null;
		System.gc();
	}
}