/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum060426;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class mainMahasiswaEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       mahasiswaEnkapsulasi mhs = new mahasiswaEnkapsulasi();
       Scanner in = new Scanner(System.in);
       
       System.out.print("Masukkan nama= ");
       mhs.setNama(in.nextLine());
       System.out.print("Masukkan NIM= ");
       mhs.setNim(in.nextLine());
       System.out.print("Masukkan Jurusan= ");
       mhs.setJurusan(in.nextLine());
       System.out.print("Masukkan Umur= ");
       mhs.setUmur(in.nextInt());
       System.out.print("Masukkan IPK= ");
       mhs.setIpk(in.nextDouble());
       
       System.out.println("======================");
       System.out.println("Nama     :"+mhs.getNama());
       System.out.println("NIM      :"+mhs.getNim());
       System.out.println("Jurusan  :"+mhs.getJurusan());
       System.out.println("Umur     :"+mhs.getUmur());
       System.out.println("IPK      :"+mhs.getIpk());
       
       System.out.println("Status kelulusan= "+mhs.statusKelulusan());
    }
    
}
