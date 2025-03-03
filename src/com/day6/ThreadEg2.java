package com.day6;

class Add
{
	public void Add()
	{
		System.out.println("add()");
	}	
}
class Sub
{
	public void Sub() {
		System.out.println("sub()");
	}
}
public class ThreadEg2 implements Runnable {
	public void run()
	{
		try
		{
			System.out.println("run()");
			Add a = new Add();
			Thread.sleep(1000);
			a.Add();
			Sub s = new Sub();
			s.Sub();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadEg2 t = new ThreadEg2();
		ThreadGroup tg = new ThreadGroup("BANK");
		Thread t1 = new Thread(tg,t,"Bank");
		Thread t2 = new Thread(tg,t,"Credit");
		ThreadGroup tg1 = new ThreadGroup("MONTH");
		Thread t3 = new Thread(tg,t,"Add");
		Thread t4 = new Thread(tg,t,"Div");
		t1.start();
		t3.start();
		System.out.println(tg.activeCount()+" TG1");
		System.out.println(tg1.activeCount()+" TG2");
		
		
	}
}
