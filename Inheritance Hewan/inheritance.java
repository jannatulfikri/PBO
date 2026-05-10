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
public class inheritance {
    protected String nama;
    
    public inheritance (String nama){
        this.nama=nama;
    }
    public void bersuara (){
        System.out.println("hewan bersuara=  ");
    }
    public void tampilkanNama (){
        System.out.println("nama hewan= "+nama);
    }
}
