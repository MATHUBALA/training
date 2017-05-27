package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {
     public static void inserUser(){
    	 Connection connection=null;
    	 Statement statement=null;
    	 try{
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
             connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");    	 
    	     System.out.println(connection);
             statement=connection.createStatement();  	 
             System.out.println(statement);
             String sql="insert into users values(1001,'mathu')";
             int i=statement.executeUpdate(sql);
             System.out.println(i);
    	 
    	 }catch(Exception e){
    		 e.printStackTrace();
    		 
    	 }finally{
    		 try{
    			 if(statement!=null)
    				 statement.close();
    			 if(connection!=null)
    				 connection.close();
    		 }catch(Exception e){
    			 e.printStackTrace();
    		 }
    	 }
     }
     public static void main(String[] args) {
		inserUser();
	}
}
