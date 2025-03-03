package com.day7;
import java.util.*;

public class Collct3 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search(8));
		System.out.println(s.isEmpty());
		System.out.println(s.empty());
//		s.clear();
		System.out.println(s);
		System.out.println(s.empty());
		Enumeration e = s.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
    	}
	}
}
