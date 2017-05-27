package com.io;

import java.nio.CharBuffer;

public class ChannelExample {

	public static void main(String[] args) {
		CharBuffer buffer=CharBuffer.allocate(8);
		
		String text="apple";
		System.out.println("Input text:"+text);
		
		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			buffer.put(c);
		}
		int buffpos=buffer.position();
		
		System.out.println("Position after data is writen into buffer:"+buffpos);
	    buffer.flip();
	    System.out.println("Reading buffer contents:");
	    while(buffer.hasRemaining()){
	    	System.out.println(buffer.get());
	    }
	    
	}

}
