package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
      Connection c =DriverManager.getConnection("jdbc:mysql:///atm","root","");    
        Statement s =c.createStatement();  
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  