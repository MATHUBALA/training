package com.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("one");
		System.out.println(set);
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("one");
		arraylist.add("two");
		arraylist.add("one");
		System.out.println(arraylist);
		Set<String> setone = new HashSet<String>(arraylist);
		System.out.println(setone);
		
		LinkedHashSet< String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("one");
		for(int i=0;i<10;i++){
			linkedHashSet.add("two"+i);
			setone.add("two"+i);
		}
		System.out.println("linked hash set value");
		System.out.println(linkedHashSet);
		System.out.println(setone);
		
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("four");
		System.out.println("Tree set value ");
		System.out.println(treeSet);
		
		NavigableSet navi=treeSet.headSet("three", false);
		System.out.println("HeadSet value");
		System.out.println(navi);
		NavigableSet navi1 =treeSet.tailSet("three", true);
		System.out.println("TailSet value");
		System.out.println(navi1);
		
	}

}
