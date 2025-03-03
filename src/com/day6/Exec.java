package com.day6;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableInt implements Runnable
{

	public void run() {
		System.out.println("run() implemeted");
	}
	
}
public class Exec {
	static ExecutorService ex = Executors.newFixedThreadPool(2);
	public static void main(String[] args) {
		RunnableInt r = new RunnableInt();
		Thread th = new Thread(r);
		th.start();
		ex.submit(th);
		ex.shutdown();
	}
}
