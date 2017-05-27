package com.util.vector;

import java.util.Hashtable;
import java.util.Vector;

public class OldDs {
	public static void main(String[] args) {
		Vector vec=new Vector();
		vec.add(12);
		vec.add("one");
		vec.add(12.22);
		
		Double dou=(Double)vec.get(2);
        System.out.println(dou);
        
        Vector<String> vecstr=new Vector<String>();
		vecstr.add("one");
		vecstr.add("two");
        String s=vecstr.get(1);
        System.out.println(s);
        
        Hashtable<String, Integer> ht=new Hashtable<String,Integer>();
        	ht.put("one",1);
        	ht.put("two", 2);
        	ht.put("three", 3);
        	
        	int i=ht.get("two");
        	System.out.println(i);
        	
        
        }

}
