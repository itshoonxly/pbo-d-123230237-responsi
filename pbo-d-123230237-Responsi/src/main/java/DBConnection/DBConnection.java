package DBConnection;

import java.sql.*;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost/pabrik_db";
    private static final String user = "root";
    private static final String pass = "";
    
    public static Connection getConnection(){
        try{
            System.out.println("Koneksi Berhasil!");
            return DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
}
