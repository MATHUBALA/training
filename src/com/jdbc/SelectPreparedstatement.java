package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectPreparedstatement {

public static void prepared(){
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet rst=null;
          try{
        	  Class.forName("oracle.jdbc.driver.OracleDriver");
              connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
              System.out.println(connection);
        	  String sql="select CUSTOMER_ID from users where CUSTOMER_ID=?";
              statement=connection.prepareStatement(sql);
              statement.setInt(1,1001);
              
              rst=statement.executeQuery();
              
              while(rst.next()){
            	  System.out.println("--------");
            	  System.out.println(rst.getInt(1));
            
            	  
              }
              
          
          
          }catch(Exception e){
      		e.printStackTrace();
      	}finally{
      		try{
      			if(rst!=null)
      				rst.close();
      			if(connection!=null)
      				connection.close();
      			if(statement!=null)
      				statement.close();
      		}catch(Exception e){
      			e.printStackTrace();
      		}
      	}
      }
     
      

public static void main(String[] args) {
	prepared();
}
	}


