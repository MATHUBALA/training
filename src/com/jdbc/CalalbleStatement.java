package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

public class CalalbleStatement {
public static void oneprodure(){
	Connection connection=null;
	CallableStatement statement=null;
	ResultSet rst=null;
      try{
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
          connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
          System.out.println(connection);
    	  String sql="select CUSTOMER_ID from users where CUSTOMER_ID=?";
          statement=connection.prepareCall("{call oneprodure(?,?)");
          statement.setInt(1,101);
          statement.setString(2,"bala");
          statement.registerOutParameter(1, Types.INTEGER);
          statement.registerOutParameter(2, Types.VARCHAR);
          statement.execute();
          
          statement.getInt(1);
          statement.getString(2);
          
          
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
	
}  
}

