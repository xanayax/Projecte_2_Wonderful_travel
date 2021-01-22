package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexio {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/prj02";
    private String usuari = "root";
    private String passwd = "";
    private static Connection conn;
    private static Statement st;
 
    private Connexio() {
    	 try{
    	     Class.forName(driver);
    	     conn = DriverManager.getConnection(url, usuari, passwd);
    	 }
    	 catch(ClassNotFoundException | SQLException e){
    	     e.printStackTrace();
    	 }
    }

    public static Connection getConnection() throws SQLException{
    	
		 if (conn == null){
		     new Connexio();
		 }else if(conn.isClosed()) {
			 new Connexio();
		 }
  
		 return conn;
    }
    
    public static Statement objectStatement() throws SQLException {
		st = getConnection().createStatement();
    	return st;
    }
}
