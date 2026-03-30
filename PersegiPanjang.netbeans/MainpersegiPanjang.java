/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum300326;
import java.util.Scanner;
/**
 *
 * @author LAB-SI-PC
 */
public class MainpersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang ppl = new PersegiPanjang();
        ppl.panjang = 20;
        ppl.lebar = 10;
        int luas = ppl.hitungLuas();
        System.out.println("objek persegi panjang pertama ");
        System.out.println("panjang = "+ppl.panjang);
        System.out.println("lebar = "+ppl.lebar);
        System.out.println("Luas= "+luas);
        System.out.println ("keliling = "+ppl.hitungKeliling());
        
        //memuat objek ke 2
        PersegiPanjang pp2 = new PersegiPanjang(10,5);
        luas = pp2.hitungLuas();
        System.out.println("objek persegi panjang pertama ");
        System.out.println("panjang = "+pp2.panjang);
        System.out.println("lebar = "+pp2.lebar);
        System.out.println("Luas= "+luas);
        System.out.println ("keliling = "+pp2.hitungKeliling());
        
        //membuat objek ke 3 dengan kostraktor 2
        Scanner in = new Scanner(System.in);
        System.out.println("objek persegi panjang ke 3");
        System.out.print("panjang= ");
        int p= in.nextInt();
        System.out.print("lebar= ");
        int l= in.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(p,l);
        System.out.println("luas = "+pp3.hitungLuas());
        System.out.println("keliling= "+pp3.hitungKeliling());
    }
    
}
