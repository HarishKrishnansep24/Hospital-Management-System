
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Connectivity {
    
   public static Connection getvalue()
    {
    String url="jdbc:mysql://localhost:3306/";
    String dbname="hms";
   String drive="com.mysql.jdbc.Driver";
    String username="root";
    String password="";
   Connection conn=null;
 //    PreparedStatement ps=null;
    try
    {    
    
    Class.forName(drive).newInstance();       
    conn= (Connection) DriverManager.getConnection(url+dbname,username,password);

//        conn = (Connection) DriverManager.getConnection(url+dbname,username,password);
    System.out.println("Connected");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return conn;
    }
     public static void main(String ars[])
    {
           Connectivity.getvalue();
        
    }
    
}
