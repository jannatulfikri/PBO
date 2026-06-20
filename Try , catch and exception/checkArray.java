/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum080626;
import java.util.*;
//menggunakan * dalam import java util agar semua import yang memakai java util langsung include semua
/**
 *
 * @author janna
 */
public class checkArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] angka = {10,20,30,40,50};
        int i;
        try {
            System.out.println("mau bagi berapa angka index ke berapa ");
            int index = in.nextInt();
       
            System.out.print("Angka pada index " +index + " adalah " +angka [index]+ "\nmau dibagi berpa?");
            int pembagi = in.nextInt();
        
            int hasil = angka[index]/pembagi;
            System.out.println("hasil bagi = "+hasil);
        }
        //exception diluar jangkauan
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index array tidak ada ");
        }
        catch (InputMismatchException e ){
            System.out.println("tidak boleh huruf");
        }
        catch (ArithmeticException e){
            System.out.println("tidak boleh dibagi dengan 0");            
        }
        finally{
            System.out.print("proses selesai, isi array adalah "+java.util.Arrays.toString(angka));
            
        }
    }
    
}
