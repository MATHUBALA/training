package com.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLExample {

	public static void main(String[] args) {
		BufferedReader br=null;
		try{
			URL url=new URL("http://www.bay.com");
			URLConnection connection=url.openConnection();
			br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String temp="";
            while((temp=br.readLine())!=null){
            	System.out.println(temp);
            }
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br !=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}
