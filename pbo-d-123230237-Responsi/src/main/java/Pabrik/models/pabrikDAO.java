package Pabrik.models;

import DBConnection.DBConnection;
import java.sql.*;
import java.util.*;

public class pabrikDAO {
    private final Connection conn;
    
    public pabrikDAO(){
        this.conn = DBConnection.getConnection();
    }
    public void insert(pabrik factory){
        if(factory.getEfisiensiProduksi() < 20){
            throw new IllegalArgumentException("Data tidak dapat masuk kedalam database!");
        }
        else{
            String query = "INSERT INTO dataProduksi(namaProduk, biayaPekerja, efisiensiProduksi, totalBiaya) VALUES (?, ?, ?, ?);";
            try(PreparedStatement statement = conn.prepareStatement(query)){
                statement.setString(1, factory.getNamaProduk());
                statement.setDouble(2, factory.getBiayaPekerja());
                statement.setDouble(3, factory.getEfisiensiProduksi());
                statement.setDouble(4, factory.getTotalBiaya());
                statement.executeUpdate();
            }catch(SQLException e){
                System.out.println("Penambahan Data Gagal: " + e.getLocalizedMessage());
            }
        }
    }
    public List<pabrik> getAll(){
       List<pabrik> list = new ArrayList<>();
       String query = "SELECT * FROM dataProduksi";
       try(Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query)){
           while(rs.next()){
               list.add(new pabrik(
               rs.getString("namaProduk"),
               rs.getDouble("biayaPekerja"),
               rs.getDouble("efisiensiProduksi"),
               rs.getDouble("totalBiaya")        
               ));
           }
       }catch(SQLException e){
               System.out.println("Fetch Failed: " + e.getLocalizedMessage());
       }
       return list;
    }
    public void update(pabrik factory){
        String query = "UPDATE dataProduksi SET namaProduk=?, biayaPekerja=?, efisiensiProduksi=?, totalBiaya=? WHERE idProduk=?";
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setString(1, factory.getNamaProduk());
            statement.setDouble(2, factory.getBiayaPekerja());
            statement.setDouble(3, factory.getEfisiensiProduksi());
            statement.setDouble(4, factory.getTotalBiaya());
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println("Edit Data Gagal: " + e.getLocalizedMessage());
        }
    }
    public void delete(int idProduk){
        String query = "DELETE FROM dataProduksi WHERE idProduk=?";
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setInt(1, idProduk);
            statement.executeUpdate();            
        }catch(SQLException e){
            System.out.println("Hapus Data Gagal: " + e.getLocalizedMessage());
        }
    }
}
