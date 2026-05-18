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
public class multilevelPesawat extends multilevelUdara {
    private int muatan;
    
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    public int getMuatan(){
        return muatan;
    }
    public multilevelPesawat(){
        
    }
    public multilevelPesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;
    }
    
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori (int muatan){
        if (muatan<=50)
            return "bobot kecil";
        else if(muatan <=100)
            return "bobot menengah";
        else 
            return "bobot besar";
    }
    @Override
    public void cetak (){
        super.cetak();
        System.out.println("Muatan Pesawat = "+ muatan + "orang penumpang");
        System.out.println("Kategori = "+ kategori(muatan));
    }
}
