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
public class inheritanceKucing extends inheritance {
    ///extends menambahkan pewarisan
    public inheritanceKucing (String nama){
        super (nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"berkata Meong!!");
    }
    
}
