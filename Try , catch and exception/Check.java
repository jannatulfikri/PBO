/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum080626;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class Check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b;
        
        try {
            System.out.println("masukkan angka pertama = ");
            a = in.nextInt();
            System.out.println("masukkan angka kedua");
            b = in.nextInt();
            int hasil = a/b;
            System.out.println("Hasil = "+hasil );
           
        }
        catch (InputMismatchException e){
                    System.out.println("Harus input angka");
                    }
        catch (ArithmeticException e) {
            System.out.println("Tidak boleh ada pembagian dengan angka 0");
        }
        finally {
            System.out.println("pengecekan Angka sukses");
        }
        
        
       
        
              
    }
    
}
