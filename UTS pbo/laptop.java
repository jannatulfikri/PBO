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
public class laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRam;

    public laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar,int kapasitasRam) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar=ukuranLayar;
        this.kapasitasRam=kapasitasRam;
    }//jannatul fikri 2501082013

    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar ;
    }
    public int getUkuranLayar (){
        return ukuranLayar;
    }
    public void setKapasitasRam(int kapasitasRam){
        this.kapasitasRam=kapasitasRam ;
    }
    public int getKapasitasRam (){
        return kapasitasRam;
    }
    
   
}
