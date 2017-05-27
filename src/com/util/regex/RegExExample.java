package com.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.security.auth.callback.TextOutputCallback;

public class RegExExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="This is the text to be searched"+"for occcurrences of the http://pattern";
String pattern=".*http://.*";
boolean matches =Pattern.matches(pattern,text);
	System.out.println(matches);
	String textOne="This is the text wich is to be searched"+"for occurences of the word 'is'.";
	String patternString="is";
	Pattern patternString1=Pattern.compile(patternString);
	Matcher matcher=patternString1.matcher(textOne);
	
	int count=0;
	while(matcher.find()){
		count++;
		System.out.println("found:"+count+":"+matcher.start()+"-"+matcher.end());
		
	}
	}

}
