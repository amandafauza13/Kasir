package Kasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class koneksi {
    
  private static Connection MySQLConfig;  
    public static Connection configDB()throws SQLException{
        try {
            String url ="jdbc:mysql://localhost/db_barbershop";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig  = DriverManager.getConnection(url,user,pass); 
            return MySQLConfig;
        } catch ( SQLException e) {
            System.err.println("koneksi ke Database gagal" +e.getMessage());
        }
        return null;
    }

    static Connection getkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
        
    
    

