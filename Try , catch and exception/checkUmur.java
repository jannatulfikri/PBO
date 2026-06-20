/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum080626;

import java.util.*;

/**
 *
 * @author janna
 */
public class checkUmur {

    // Method untuk mengecek nilai
    public static void cekNilai(int nilai) throws Exception {

        if (nilai < 0) {
            throw new Exception("nilai tidak boleh negatif");
        }

        else if (nilai > 100) {
            throw new Exception("nilai maksimal = 100");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {

            System.out.print("Masukkan sebuah angka = ");
            int angka = in.nextInt();

            cekNilai(angka);

            System.out.println("Nilai yang dimasukkan = " + angka);

        }

        catch (InputMismatchException e) {
            System.out.println("tidak boleh huruf");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("proses selesai");
        }
    }

}