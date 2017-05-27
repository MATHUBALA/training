package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCSelectExample {
public static void select(){
	Connection connection=null;
	Statement statement=null;
	ResultSet rst=null;
	try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
         connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
         DatabaseMetaData daMetaData=connection.getMetaData();
         System.out.println(daMetaData.getDatabaseProductName());
         System.out.println(daMetaData.getDatabaseMajorVersion());
        System.out.println(connection);
        statement=connection.createStatement();
        String sql="select*from users";
        rst=statement.executeQuery(sql);
        ResultSetMetaData metaData=rst.getMetaData();
        System.out.println("column count:"+metaData.getColumnCount());
        while(rst.next()){
        	System.out.println(rst.getInt(1));
        	System.out.println(rst.getString(2));
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
	select();
}
}
