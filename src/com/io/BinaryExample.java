package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryExample {
         public void readFile(){
        	 DataInputStream dis=null;
        	 DataOutputStream dos=null;
        	 try{
        		 dis=new DataInputStream(new FileInputStream("D:\\MATHUBALA\\photos\\pht%20in%20fb\\12038205_541208362713341_5751986991385310152_n.jpg"));
                 byte b[]=new byte[dis.available()];
                 dis.read(b);
                 dos=new DataOutputStream(new FileOutputStream("D:\\Java training\\test.jpg"));
                 dos.write(b);
        	 }catch(Exception e){
        		 e.printStackTrace();
        	 }finally{
        		 try{
        			 if(dis !=null)
        				 dis.close();
        			 if(dos!=null)
        				 dos.close();
        			 
        			}catch(Exception e2){
        				e2.printStackTrace();
        			}
        	 }
         }
         public static void main(String[] args) {
        	 BinaryExample example=new BinaryExample();
        		example.readFile();
        	
        	}
}
