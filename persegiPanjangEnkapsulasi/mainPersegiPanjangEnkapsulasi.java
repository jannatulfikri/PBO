/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum060426;
import java.util.Scanner;
/**
 *
 * @author LAB-SI-PC
 */
public class mainPersegiPanjangEnkapsulasi{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegiPanjangEnkapsulasi ppl = new persegiPanjangEnkapsulasi();
        ppl.setPanjang(7);
        ppl.setLebar (6);
        int luas = ppl.getLuas();
        System.out.println("objek persegi panjang pertama ");
        System.out.println("panjang = "+ppl.getPanjang());
        System.out.println("lebar = "+ppl.getLebar());
        System.out.println("Luas= "+luas);
        System.out.println ("keliling = "+ppl.getKeliling());
        
        //memuat objek ke 2
        persegiPanjangEnkapsulasi pp2 = new persegiPanjangEnkapsulasi(10,5);
        luas = pp2.getLuas();
        System.out.println("objek persegi panjang pertama ");
        System.out.println("panjang = "+pp2.getPanjang());
        System.out.println("lebar = "+pp2.getLebar());
        System.out.println("Luas= "+luas);
        System.out.println ("keliling = "+pp2.getKeliling());
        
        //membuat objek ke 3 dengan kostraktor 2
        Scanner in = new Scanner(System.in);
        System.out.println("objek persegi panjang ke 3");
        System.out.print("panjang= ");
        int p= in.nextInt();
        System.out.print("lebar= ");
        int l= in.nextInt();
        persegiPanjangEnkapsulasi pp3 = new persegiPanjangEnkapsulasi(p,l);
        System.out.println("luas = "+pp3.getLuas());
        System.out.println("keliling= "+pp3.getKeliling());
        
        System.out.println("jumlah objek= "+persegiPanjangEnkapsulasi.getJumlahObjek());
    }
    
}
