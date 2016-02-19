package com.Javacore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Collectionex {

	public static void main(String[] args) {

		System.out.println("LinkedList example=========");
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("venkat");
		ll.add("naveen");
		ll.add("venkat naveen");
		ll.add("venkat");
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("HashSet example==========");
		System.out.println();
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("venkat");
		hs.add("naveen");
		hs.add("venkat naveen");
		hs.add("venkat");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	}
		
		System.out.println();
		System.out.println("HashMap example==========");
		System.out.println();
		
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Venkat");  
		  hm.put(101,"Naveen");  
		  hm.put(102,"Bramhaiah"); 
		  hm.put(102,"Bramham"); 
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());

	}
		  }
}
