package com.util.generic;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

public class ArrayExample {
	
static  int count=1;
public static void main(String[] args) {
	int one[]={34,7,1,2,9,5};
	int[] two=Arrays.copyOf(one, one .length);
	for(int i=0;i<two.length;i++){
		System.out.println(two[i]);
	}
	System.out.println("the sorted array is");
	Arrays.sort(two);
	for (int i = 0; i < two.length; i++) {
		System.out.println(two[i]);
	}
    Employee emp=new Employee(1, "google", 45235.78);
	Employee emp1=new Employee(2, "ebay", 653235.77);
	Employee emp2=new Employee(2, "google", 745235.77);
	Employee emp3=new Employee(2, "ebay", 4352235.77);
	Employee emp4=new Employee(2, "ebay", 652235.77);

	Employee[] empArr={emp,emp1,emp2,emp3,emp4};
	System.out.println("--------");
    System.out.println(Arrays.toString(empArr));
    
    Comparator<Employee> comparator=new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
//			if(o1.getSalary()>o2.getSalary()){
//			return 1;	
//			}
//			if(o1.getSalary()<o2.getSalary()){
//				return -1;
//			}
//			return 0;
			return Double.compare(o1.getSalary(), o2.getSalary());
		}
	};
	Arrays.sort(empArr,comparator);
	System.out.println(Arrays.toString(empArr));
	
//	StringJoiner sj=new StringJoiner(":","[","]");
//	sj.add("mathu").add("bala").add("m");
//	String desiredString=sj.toString();
//	System.out.println(desiredString);
//	
//	StringTokenizer st=new StringTokenizer("this,is,a,token",",");
//	while(st.hasMoreTokens()){
//		System.out.println(st.nextToken());
//	}
//	Timer timer=new Timer();
//	timer.schedule(new TimerTask(){
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("called......");
//			if(count==3){
//				timer.cancel();
//			}
//			count++;
//		} 
//},3000,5000);
}
}
