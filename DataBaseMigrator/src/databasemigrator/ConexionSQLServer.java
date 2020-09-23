package databasemigrator;
import java.sql.*;
public class ConexionSQLServer {
    Connection cn;
    Statement st; 
     String IName;
     String databaseName;
    
    String username ;
    String password ;
    String puerto;
    String sqlserverurl;

    public ConexionSQLServer(String IName, String databaseName, String username, String password,String puerto) {
        this.IName = IName;
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
        this.puerto=puerto;
    }
   
    

    
    public Connection conexion() throws SQLException{
        sqlserverurl = "jdbc:sqlserver://"+IName+".cqrsybqgk1yn.us-east-1.rds.amazonaws.com\\sqlserver-db:"+puerto+";databasename="+databaseName+"";
        cn = DriverManager.getConnection(sqlserverurl, username, password);
        if(cn != null){
            DatabaseMetaData dm = (DatabaseMetaData) cn.getMetaData();
            System.out.println("Conexión exitosa");
            System.out.println("Driver Name: " + dm.getDriverName());
            
        }
        return cn;
    }

    public String getSqlserverurl() {
        return sqlserverurl;
    }

    public void setSqlserverurl(String sqlserverurl) {
        this.sqlserverurl = sqlserverurl;
    }
    
}
