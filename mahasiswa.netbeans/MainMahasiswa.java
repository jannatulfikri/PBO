/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum300326.mahasiswa;

/**
 *
 * @author LAB-SI-PC
 */import java.util.Scanner;
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        kelasMahasiswa ppl = new kelasMahasiswa();
        
            System.out.print("Nama= ");
            String n = in.nextLine();
            System.out.print("NIM= ");
            String ni = in.nextLine();
            
            System.out.println("masukkan nilai ");
            System.out.print("Tugas= ");
            ppl.tugas= in.nextInt();
            System.out.print("UTS= ");
            ppl.uts=in.nextInt();
            System.out.print("UAS= ");
            ppl.uas=in.nextInt();
            
           int nilai = ppl.hitungNilaiAkhir();
           System.out.println("nilai nilai akhir = "+nilai);
    }
    
            
    
}
