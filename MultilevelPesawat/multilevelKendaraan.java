/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum270426;

/**
 *
 * @author janna
 */
public class multilevelKendaraan {
    private String nama;
    private int tahunProduksi;
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi=tahunProduksi;
    }
    public int getTahunProduksi (){
        return tahunProduksi;
    }
    public multilevelKendaraan (){
        
    }
    public multilevelKendaraan (String nama, int tahunProduksi){
    this.nama=nama;
    this.tahunProduksi=tahunProduksi;
    }
    public void cetak(){
        System.out.println(nama + "");
        System.out.println(tahunProduksi + "");
    }
    
}
