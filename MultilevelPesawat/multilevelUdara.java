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
public class multilevelUdara extends multilevelKendaraan{
    private boolean mesin;
    
    public void setMesin(boolean mesin){
        this.mesin=mesin;
    }
    public boolean getMesin(){
        return mesin;
    }
    public multilevelUdara (){
        
    }
    public multilevelUdara (String nama, int tahunProduksi, boolean mesin){
        super(nama,tahunProduksi);
        this.mesin=mesin;
    }
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("menggunakan mesin= "+(mesin? "ya":"tidak"));
    }
    
}
