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
public class mainPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multilevelPesawat p = new multilevelPesawat("Air Asia",2020,true,130);
        System.out.println("kondisi awal");
        p.cetak();
        
        System.out.println();
        
        System.out.println("kondisi setelah reset");
        p.reset("Air asia",1998 , false, 80);
        p.cetak();
    }
    
}
