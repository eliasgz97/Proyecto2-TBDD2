package databasemigrator;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {
    Connection cn;
    Statement st;
    String databaseName;
    String IName;
    String puerto;
    String username ;
    String password ;

    public ConexionMySQL(String databaseName, String username, String password,String puerto,String IName) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
        this.IName=IName;
    }
    
    public Connection conexion() throws SQLException{
         String url = "jdbc:mysql://"+IName+".cqrsybqgk1yn.us-east-1.rds.amazonaws.com/" + "BDFuente" + "?autoReconnect=true&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
        
}
