/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum270426;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class mainPesawat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,jumlah;
        
        System.out.print("Masukkan banyak Pesawat");
        jumlah = in.nextInt();
        in.nextLine();
        
       multilevelPesawat[] daftarPesawat = new multilevelPesawat[jumlah];
       //input
       
       for (i=0;i<jumlah;i++){
           System.out.println("Input data pesawat ke "+(i+1));
           System.out.print("Nama Pesawat: ");
           String nama=in.nextLine();
           System.out.print("Tahun Produksi = ");
           int tahunProduksi = in.nextInt();
           System.out.print("Menggunakan mesin? (true/false)");
           boolean mesin = in.nextBoolean();
           System.out.print("jumlah maksimum penumpang = ");
           int muatan = in.nextInt();
           in.nextLine();
           
           daftarPesawat[i]= new multilevelPesawat(nama,tahunProduksi,mesin,muatan);
           
       }
       
       System.out.println("\t DAFTAR PESAWAT");
       System.out.print("\n data pesawat ke 1 =");
       daftarPesawat[0].cetak();
       int max= daftarPesawat[0].getMuatan();
       String namaMax = daftarPesawat[0].getNama();
       
       for (i=1;i<jumlah;i++){
           System.out.println("\n data pesawat ke = "+ (i+1)+ "==");
           daftarPesawat[i].cetak();
           if(daftarPesawat[i].getMuatan() > max){
               max=daftarPesawat[i].getMuatan();
               namaMax=daftarPesawat[i].getNama();
               
           }
          
           
       }
       
    }
    
}
