package com.day6;


public class ThreadEg extends Thread {
	@Override
	public void run()
	{
		System.out.println("From run()");
	}
	public static void main(String[] args) {
		ThreadEg t1 = new ThreadEg();
		ThreadEg t2 = new ThreadEg();
		ThreadEg t3 = new ThreadEg();
		
		System.out.println(t1.getName()+ " "+ t2.getName()+" "+t3.getName());
		t1.setName("Transfer");
		t2.setName("Credit");
		t3.setName("Debit");
		System.out.println(t1.getName()+ " "+ t2.getName()+" "+t3.getName());
		System.out.println(MAX_PRIORITY);
		System.out.println(NORM_PRIORITY);
		System.out.println(MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.setPriority(MAX_PRIORITY);
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		ThreadGroup tg1 = new ThreadGroup("BANK");
		
		
		
	}

}
