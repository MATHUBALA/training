package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class insertBatch {
public static void inserUserBatch(){
	Connection connection=null;
	Statement statement=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	    statement=connection.createStatement();
	    String sql="insert into users values(1002,'sukii')";
	    statement.executeQuery(sql);
	    String sql1=" delect *from  users where CUSTOMER_NAME='bala'";
	    statement.execute(sql1);
	    int a[]=statement.executeBatch();
	    System.out.println(Arrays.toString(a));
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
		inserUserBatch();
	}

}
