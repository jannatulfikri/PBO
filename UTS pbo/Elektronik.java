/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_PBO;//jannatul fikri 2501082013

/**
 *
 * @author LAB-SI-PC
 */
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;
    
    public Elektronik(String merek,int tahunProduksi, int garansi){
        this.merek=merek;
        this.tahunProduksi=tahunProduksi;
        this.garansi=garansi;
    }
    public void setMerek(String merek){
        this.merek= merek;
    }
    public String getMerek (){
        return merek;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi=tahunProduksi ;
    }//jannatul fikri 2501082013
    public int getTahunProduksi (){
        return tahunProduksi;
    }
    public void setGaransi(int garansi){
        this.garansi=garansi ;
    }
    public int getGaransi (){
        return garansi;
    }
    
    
}