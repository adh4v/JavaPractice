package com.day8;

import java.util.Iterator;
import java.util.TreeSet;

public class Collct10 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("A");
		t.add("A");
		t.add("1");
		t.add("B");
		t.add("3");
		t.add("C");
		System.out.println(t);
		Iterator<String> itr = t.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		t.forEach(s -> System.out.print(s+" "));
		System.out.println();
		System.out.println(t.subSet("1", "B"));
	}
	
}
