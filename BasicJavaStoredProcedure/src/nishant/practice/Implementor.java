package nishant.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Implementor extends Thread{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  Connection con = DriverManager. getConnection(
		  "jdbc:sqlserver://localhost;databaseName=dbpractice;integratedSecurity=true")
		  ; 
		  CallableStatement cstmt;
		  cstmt=con.prepareCall("{call dbo.uspGetAverageProductWeight}");
		  
		
		Thread t1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                {
                	System.out.print(System.currentTimeMillis());
                	cstmt.executeQuery();
                } 
                catch(SQLException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Create consumer thread 
        Thread t2 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                	cstmt.executeQuery();
                	System.out.print(System.currentTimeMillis());
                } 
                catch(SQLException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
        
        t1.start();
        t2.start();
		

	}

	

	
	

}
