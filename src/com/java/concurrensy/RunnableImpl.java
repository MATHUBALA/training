package com.java.concurrensy;

public  class RunnableImpl implements Runnable{
	String name;
	public RunnableImpl(String name ){
		this.name=name;
		Thread thread=new Thread(this);
		thread.start();
		
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
		try {
			one.join();
//			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main done"+Thread.currentThread());
	}
}
