package com.java.concurrensy;

public class syncKeyword {
private int count=0;
public static void main(String[] args) {
	syncKeyword word=new syncKeyword();
	word.doworker();
}
public synchronized void  increment() throws InterruptedException{
	synchronized (this) {
		count++;
	
	}
 
}
public void doworker(){
	Thread thread1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				try{
					increment();
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
			}
			
		}
	});
	thread1.start();
Thread thread2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				try{
					increment();
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
			}
			
		}
	});
	thread2.start();
	
		try{
			thread1.join();
		    thread2.join();
	}catch(InterruptedException ignored){}
		System.out.println("count is"+count);
		
	
}
}