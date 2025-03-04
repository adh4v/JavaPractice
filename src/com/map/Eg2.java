package com.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Eg2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Adhav");
		tm.put(21, "Abi");
		tm.put(3, "Aki");
		tm.put(6, "Zoro");
		tm.put(21, "Sora");	
		tm.put(12, "Deva");
		System.out.println(tm.size());
		Iterator<Entry<Integer, String>> itr = tm.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println("ID : "+e.getKey()+ " | "+" Name : "+e.getValue());
		}
		for(Integer i : tm.keySet())
		{
			System.out.println(i +" "+ tm.get(i));
		}
		for(String i : tm.values())
			System.out.println(i);
		tm.forEach((t, u) -> System.out.println(t +"  "+ u));
	}
}
