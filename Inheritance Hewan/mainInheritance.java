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
public class mainInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pembuatan objek
        inheritance hewanku = new inheritance("Makhluk Hidup");
        inheritanceKucing kucingku = new inheritanceKucing("Bobyy ");
        inheritanceAnjing anjingku = new inheritanceAnjing("Helly ");
        //mengakses super class
        System.out.println("Tampilkan akses super class hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub class kucing
        System.out.println("\nTampiilkan sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        //mengakses sub class anjing
        System.out.println("\nTampiilkan sub class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
    }
    
}
