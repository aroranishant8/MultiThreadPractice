package org.arpit.javapostsforlearning.webservices;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld {
	
	public  String sayHelloWorld(String name) throws ClassNotFoundException, SQLException
	 {
		/*
		 * Connection con = DriverManager. getConnection(
		 * "jdbc:sqlserver://localhost;databaseName=dbpractice;integratedSecurity=true")
		 * ;
		 */
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con = DriverManager. getConnection(
				  "jdbc:sqlserver://localhost;databaseName=dbpractice;username=root;password=Arora123")
				  ;
			 
		  CallableStatement cstmt;
		  cstmt=con.prepareCall("{call dbo.uspGetAverageProductWeight}");
		  System.out.println("Stored Procedure Called by WS");
			cstmt.executeQuery(); 		
	
		return "Stored Procedure Executed Successfully by WS";
	 }

}
