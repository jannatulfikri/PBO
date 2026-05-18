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
public class mainPesawat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multilevelPesawat[] daftarPesawat = new multilevelPesawat[3];
        //buat objek bertipe array
        daftarPesawat[0]=new multilevelPesawat("Air Asia",2015,true,180);
        daftarPesawat[1]=new multilevelPesawat("Lion Air",2018,false,100);
        daftarPesawat[2]=new multilevelPesawat("Merpati",2010,true,700);
        
        System.out.println("\t DAFTAR PESAWAT\n");
        for (int i=0; i<daftarPesawat.length;i++){
            System.out.println("\n data pesawat ke "+ (i+1)+ "==");
            daftarPesawat[i].cetak();
            System.out.println();
            
        }
    }
    
}
