package com.java.concurrensy;

public class threatExample extends Thread {
	String name;
public threatExample(String name ){
	this.name=name;
	setName(name);
	start();
}
@Override
	public void run() {
for (int i = 0; i < 10; i++) {
	System.out.println(name + "= " +i+" "+Thread.currentThread());
	try {
		Thread.sleep(5);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}		
}
public static void main(String[] args) {
	threatExample one=new threatExample("one");
	threatExample two =new threatExample("two");
	System.out.println("main done"+Thread.currentThread());
}
}

