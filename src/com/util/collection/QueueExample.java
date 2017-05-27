package com.util.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueExample {

	public static void main(String[] args) {
		
	Comparator<String> lenCom=new Comparator<String>() {

		@Override
		public int compare(String arg0, String arg1) {
			return Long.compare(arg0.length(), arg1.length());
		}

	};
	
	
	PriorityQueue<String> queue=new PriorityQueue<String>(10,lenCom);
	queue.add("333212321");
	queue.add("23232");
	queue.add("232");
	queue.add("wwwqqesssssssss");
	System.out.println(queue);
	System.out.println("the head of the queue value :");
	String head=queue.peek();
	System.out.println(head);
	
	System.out.println("the head1 of the queue value :");
	String head1=queue.poll();
	System.out.println(queue);
	
	
	Stack<String> stack=new Stack<String>();
	stack.add("3essssss");
	stack.add("3edssdffs");
	stack.add("rsfget");
	stack.add("ffghghj");
	String a=stack.push("aaaa");
	System.out.println(stack);
	System.out.println(stack);
	String str=stack.peek();
	System.out.println(str);
	String str1=stack.pop();
	System.out.println(stack);
	}

}
