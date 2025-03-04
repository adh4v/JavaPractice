package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Eg1 {
	public static void main(String[] args) {
		//Map m= new HashMap();
		LinkedHashMap m = new LinkedHashMap();
		m.put(11,"A");
		m.put(12, "A");
		m.put(13, "C");
		m.put(24, "D");
		m.put(15, "E");
		System.out.println(m);
		Iterator<Entry> itr = m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry e = itr.next();
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		
	}
}
