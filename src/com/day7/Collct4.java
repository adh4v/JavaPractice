package com.day7;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collct4 {
	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		a.add("g");
		java.util.Iterator<String> itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		ListIterator<String> ltr = a.listIterator();
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}
