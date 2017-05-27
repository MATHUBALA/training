package com.java.concurrent.waitnodify;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockQueueExample {
private static ArrayBlockingQueue queue=new ArrayBlockingQueue(10);
public static void main(String[] args) throws InterruptedException {
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				producer();
			
			}catch(InterruptedException igException){
			}
			}
		});
Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				consumer();
			
			}catch(InterruptedException exception){
				
			}
		}
	});
t1.start();
t2.start();
Thread.sleep(30000);
System.exit(0);
}

private static void producer() throws InterruptedException{
	Random random=new Random();
	while(true){
		queue.put(random.nextInt(100));
	}
}
private static void consumer() throws InterruptedException{
	Random random=new Random();
	while(true){
		Thread.sleep(10);
		if(random.nextInt()==0){
			Integer value=(Integer) queue.take();
			System.out.println("taken value:"+value+";Queue size is:"+queue.size());
		}
	}
	}
}

