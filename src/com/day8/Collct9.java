package com.day8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Collct9 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		HashSet<Integer> h = new HashSet<>();
		LinkedHashSet l = new LinkedHashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(1.3f);
		hs.add(true);
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		hs.forEach(t -> System.out.println(t));
		l.add(2);
		l.add(1);
		l.add(1);
		l.add("A");
		l.add(6);
		l.add(7);
		System.out.println(l);
	}
}
