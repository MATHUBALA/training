package com.net;

import java.beans.Expression;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class CliSoc {
public CliSoc(){
	Socket soc=null;
	InputStream is =null;
	BufferedOutputStream bos=null;
	try{
		soc=new Socket("localhost",10000);
		is=soc.getInputStream();
		int i=0;
		while((i=is.read())!=-1){
			System.out.println((char)i);
		}
		bos=new BufferedOutputStream(soc.getOutputStream());
		bos.write("from client".getBytes());
		bos.flush();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(soc !=null){
				soc.close();
			if(is!=null)
				is.close();
			if(bos!=null)
				bos.close();
			
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
}
