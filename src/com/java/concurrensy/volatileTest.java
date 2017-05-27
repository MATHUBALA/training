package com.java.concurrensy;

public class volatileTest extends Thread{
volatile Boolean keeprunning=true;
@Override
	public void run() {
	long count=0;
	while(keeprunning){
		count++;
		}
	System.out.println("the thread terminated"+count);
	}

public static void main(String[] args) throws InterruptedException {
	volatileTest vol=new volatileTest();
	vol.start();
	Thread.sleep(1000);
	vol.keeprunning=false;
	System.out.println("The keeprunning set to false");
}
}

