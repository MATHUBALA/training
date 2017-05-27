package com.io;

import java.beans.Customizer;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ser {

	public static void main(String[] args) {
		Ser s=new Ser();
		String s1="this";
		String sp[]=s1.split(" ");
		for(String string:sp){
			System.out.println(string);
		}
		s.doSer();
		//s.doDeSer();
	}
	public void doSer(){
		ObjectOutputStream oos=null;
		//ByteArrayInputStream baos=null;
		try{
			//baos=new ByteArrayInputStream();
			Customer cus=new Customer();
			cus.setId(110);
			cus.setName("sss");
			oos=new ObjectOutputStream(new FileOutputStream("D:\\Java training\\test.ser1"));
			oos.writeObject(cus);
            //oos.flush();
            //byte b[]=baos.toByteArray();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(oos !=null)
				    oos.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}

}
