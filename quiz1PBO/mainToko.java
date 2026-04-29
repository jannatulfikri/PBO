/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1PBO;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class mainToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner in = new Scanner (System.in);
       
       System.out.print("masukkan nama makanan: ");
       String nama = in.nextLine();
       System.out.print("masukkan harga kue: ");
       double harga = in.nextDouble();
       System.out.print("masukkan jumlah pembelian: ");
       double jumlah = in.nextDouble();
       System.out.print("masukkan jenis kue: ");
       char jenis = in.next().charAt(0);
       System.out.print("masukkan kategori:  ");
       char kategori = in.next().charAt(0);
       
       //urutan nya harus sama
       toko ibu = new toko (nama, harga,jumlah, jenis, kategori);
       System.out.println("nama = "+ ibu.getNama());
       System.out.println("harga = "+ ibu.getHarga());
       System.out.println("jumlah = "+ ibu.getJumlah());
       System.out.println("jenis = "+ ibu.getJenis());
       System.out.println("kategori = "+ ibu.getkategori());
       
       System.out.println("nama = "+ ibu.total());
       
    }
    
}
