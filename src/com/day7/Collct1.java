package com.day7;

import java.util.*;

public class Collct1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		List l = new ArrayList();
		ArrayList a = new ArrayList();
		a.add(1);
		a.add("A");
		a.add(11.1);
		a.add(true);
//		System.out.println(a);
//		a.set(1, "Hello");
//		System.out.println(a);
//		System.out.println(a.size());
//		a.remove(3);
//		System.out.println(a);
//		System.out.println(a.get(2));
//		System.out.println(a.contains("Hello"));
//		System.out.println();
		Iterator itr = a.iterator();
		ListIterator ltr = a.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+" ");
		}
		System.out.println();
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}
}
