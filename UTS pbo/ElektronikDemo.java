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
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elektronik El = new Elektronik("Samsung", 2023 , 6);
        
       System.out.println("merek = "+El.getMerek()); 
       System.out.println("tahun produksi = "+El.getTahunProduksi());
       System.out.println("masa garansi = " +El.getGaransi()+ "tahun");
       
       laptop La = new laptop("Samsung", 2023 , 6,6,16);
       System.out.println("Ukuran layar = "+La.getUkuranLayar()+"inch");
       System.out.println("Ukuran RAM = "+La.getKapasitasRam()+"GB");//jannatul fikri 2501082013
       
       gaming Ga = new gaming ("Samsung", 2023 , 6,6,16,"NVidia GeForce", 144);
       System.out.println("Kartu Grafis yang digunakan = " +Ga.getKartuGrafis());
       System.out.println("RefreshRate layarnya = " +Ga.getRefreshRate()+ "Hz");
    }
    
}
