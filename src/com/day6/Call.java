package com.day6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallInf implements Callable
{

	@Override
	public String call() throws Exception {
		return "Hello";
	}
	
}
public class Call {
	static ExecutorService ex = Executors.newFixedThreadPool(2);
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallInf c = new CallInf();
		Future<String> future = ex.submit(c);
		System.out.println(future.get().toString());
		ex.shutdown();
	}
}
