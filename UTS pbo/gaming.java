/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_PBO; //jannatul fikri 2501082013

/**
 *
 * @author LAB-SI-PC
 */
public class gaming extends laptop{
    private String kartuGrafis;
    private int refreshRate;

    public gaming(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRam, String kartuGrafis, int refreshRate) {
        super(merek, tahunProduksi, garansi, ukuranLayar, kapasitasRam);
        this.kartuGrafis=kartuGrafis;
        this.refreshRate=refreshRate;
    }
    //jannatul fikri 2501082013
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis=kartuGrafis ;
    }
    public String getKartuGrafis (){
        return kartuGrafis;
    }
    
    public void setRefreshRate(int refreshRate){
        this.refreshRate=refreshRate ;
    }
    public int getRefreshRate (){
        return refreshRate;
    }
}
