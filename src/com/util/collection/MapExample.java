package com.util.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,Integer> map=new HashMap<String,Integer>();
	 map.put("one",12);
	 map.put("two",121);
	 map.put("three",123);
	 map.put("four", 1240);
	 
	 System.out.println(map);
	 
	 Set<String> set=map.keySet();
	 Collection<Integer> val=map.values();
	 Iterator<String> iterKey=set.iterator();
	 Iterator<Integer> iterVal=val.iterator();
	 
	 while(iterKey.hasNext()){
		 System.out.println(iterKey.next()+"=="+iterVal.next());
		 
	 }
	 Integer value=map.get("four");
	 System.out.println(value);
	 System.out.println("Linked Hashmap output");
	 Map<String,Integer> mapLink=new LinkedHashMap<String,Integer>();
	 mapLink.put("one", 12);
	 mapLink.put("two", 121);
	 mapLink.put("three", 324);
	 mapLink.put("four", 246);
	 System.out.println(mapLink);
	 
	 System.out.println("Treemap output");
	 TreeMap<String,Integer> mapTree=new TreeMap<String,Integer>();
	 mapTree.put("one", 12);
	 mapTree.put("two", 121);
	 mapTree.put("three", 324);
	 mapTree.put("four", 246);
	 System.out.println(mapTree);
	 
	 System.out.println("Navigablemap output");
	 NavigableMap<String, Integer> naviMap=mapTree.headMap("three",true);
     System.out.println(naviMap);
     NavigableMap<String, Integer> naviTail=mapTree.tailMap("three", true);
     System.out.println(naviTail);
	
	}

}
