package Pabrik.models;

public class pabrik {
    private int idProduk;
    private String namaProduk;
    private int jumlahUnit;
    private int jamKerja;
    private int jumlahPekerja;
    private int biayaBahan;
    private double biayaPekerja;
    private double efisiensiProduksi;
    private double totalBiaya;
    
    public pabrik(int idProduk, String namaProduk, int jumlahUnit, int jamKerja, int jumlahPekerja, int biayaBahan){
        this.namaProduk = namaProduk;
        this.jumlahUnit = jumlahUnit;
        this.jamKerja = jamKerja;
        this.jumlahPekerja = jumlahPekerja;
        this.biayaBahan = biayaBahan;
        this.idProduk = idProduk;   
    }
    
    public pabrik(String namaProduk, double biayaPekerja, double efisiensiProduksi, double totalBiaya){
        this.namaProduk = namaProduk;
        this.biayaPekerja = biayaPekerja;
        this.efisiensiProduksi = efisiensiProduksi;
        this.totalBiaya = totalBiaya;
    }
    
    public int getIDProduk(){
        return idProduk;
    }
    
    public void setIDProduk(int idProduk){
        this.idProduk = idProduk;
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public int getJumlahUnit(){
        return jumlahUnit;
    }
    
    public void setJumlahUnit(int jumlahUnit){
        this.jumlahUnit = jumlahUnit;
    }
    
    public int getJamKerja(){
        return jamKerja;
    }
    
    public void setJamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }
    
    public int getJumlahPekerja(){
        return jumlahPekerja;
    }
    
    public void setJumlahPekerja(int jumlahPekerja){
        this.jumlahPekerja = jumlahPekerja;
    }
    
    public int getBiayaBahan(){
        return biayaBahan;
    }
    
    public void setBiayaBahan(int biayaBahan){
        this.biayaBahan = biayaBahan;
    }
    
    public double getBiayaPekerja(){
        biayaPekerja = jamKerja * jumlahPekerja * 15000;
        return biayaPekerja;
    }
    
    public void setBiayaPekerja(double biayaPekerja){
        this.biayaPekerja = biayaPekerja;
    }
    
    public double getEfisiensiProduksi(){
        efisiensiProduksi = (jumlahUnit / (jamKerja * jumlahPekerja)) * 100;
        return efisiensiProduksi;
    }
    
    public void setEfisiensiProduksi(double efisiensiProduksi){
        this.efisiensiProduksi = efisiensiProduksi;
    }
    
    public double getTotalBiaya(){
        totalBiaya = biayaBahan + (jamKerja * jumlahPekerja * 15000);
        return totalBiaya;
    }
    
    public void setTotalBiaya(double totalBiaya){
        this.totalBiaya = totalBiaya;
    }
}
