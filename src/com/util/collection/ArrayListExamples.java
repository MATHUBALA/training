package com.util.collection;

import java.util.List;

import com.util.generic.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExamples {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
	    list.add("one");
	    list.add("two");
	    list.add("three");
	    System.out.println(list.get(2));
	    
	    Employee emp=new Employee(1, "google", 45235.78);
		Employee emp1=new Employee(2, "ebay", 653235.77);
		Employee emp2=new Employee(2, "google", 745235.77);
		Employee emp3=new Employee(2, "ebay", 4352235.77);
		Employee emp4=new Employee(2, "ebay", 652235.77);
        Employee[] empArr={emp,emp1,emp2,emp3,emp4};
        
        List<Employee> emplist=new ArrayList<Employee>(Arrays.asList(empArr));
        	
	
	   Comparator<Employee> comparator=new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {

			return Double.compare(o1.getSalary(), o2.getSalary());
		}
	};
	
Collections.sort(emplist,comparator);	
System.out.println(emplist);
	}
}
