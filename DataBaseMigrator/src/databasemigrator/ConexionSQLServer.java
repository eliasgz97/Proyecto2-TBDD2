package databasemigrator;
import java.sql.*;
public class ConexionSQLServer {
    Connection cn;
    Statement st;   
    String sqlserverurl = "jdbc:sqlserver://sqlserver-db.cqrsybqgk1yn.us-east-1.rds.amazonaws.com\\sqlserver-db:1433;databasename=Proyecto2_BD2";
    String username = "admin";
    String password = "root1234";
    public Connection conexion() throws SQLException{
        cn = DriverManager.getConnection(sqlserverurl, username, password);
        if(cn != null){
            DatabaseMetaData dm = (DatabaseMetaData) cn.getMetaData();
            System.out.println("Conexión exitosa");
            System.out.println("Driver Name: " + dm.getDriverName());
            
        }
        return cn;
    }
}
