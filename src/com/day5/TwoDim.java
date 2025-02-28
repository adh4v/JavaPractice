package com.day5;

import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

public class TwoDim
{
	public static void main(String[] args) {
		
	Integer[] a= {1,2,3,2,4,6,6,6};
	HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
	StringBuffer sb=new StringBuffer();
	{ 
		for(int i=0;i<a.length;i++){
			int c=0;
		if(!hm.containsKey(a[i])){
			hm.put(a[i],1);
		}
		else{
			hm.get(a[i]);
			hm.put(a[i],hm.get(a[i])+1);
		}
	}
  }
   HashSet<Integer>l=new HashSet<Integer>();
   {
	   for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])>1)
			{
				l.add(a[i]);
			}
		}
	   for(Integer i : l) System.out.print(i+" ");
	   }
	}
}

