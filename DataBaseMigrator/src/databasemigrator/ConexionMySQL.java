package databasemigrator;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {
    Connection cn;
    Statement st;
    String databaseName = "Proyecto2-BD2";
    String url = "jdbc:mysql://mysql-db.cqrsybqgk1yn.us-east-1.rds.amazonaws.com/" + "BDFuente" + "?autoReconnect=true&useSSL=false";
    String username = "admin";
    String password = "root1234";
    public Connection conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
        
}
