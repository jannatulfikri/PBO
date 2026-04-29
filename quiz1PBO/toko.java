/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1PBO;

/**
 *
 * @author janna
 */
public class toko {
    private String nama;
    private double harga;
    private double jumlah;
    private char kategori;
    private char jenis;
    
    public toko(String nama, double harga, double jumlah, char kategori, char jenis){
        this.nama=nama;
        this.harga=harga;
        this.jumlah=jumlah;
        this.kategori=kategori;
        this.jenis=jenis;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void setHarga(double harga){
        this.harga=harga;
    }
    public double getHarga(){
        return harga;
    }
    
    public void setJumlah(double jumlah){
        this.jumlah=jumlah;
    }
    public double getJumlah(){
        return jumlah;
    }
    
    public void setKategori (char kategori){
        this.kategori=kategori;
    }
    public char getkategori(){
        return kategori;
    }
    
    public void setJenis (char jenis){
        this.jenis=jenis;
    }
    public char getJenis (){
        return jenis;
    }
    
    public  double total(){
        return this.jumlah * this.harga;
    }
}
