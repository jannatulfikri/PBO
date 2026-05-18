/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas180526;

/**
 *
 * @author janna
 */
public abstract class transportasiOnline {
    
    protected String nama;

    public transportasiOnline(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

   


    //method polymorphism
    public abstract void jenisTransport();
    
    
    
    }

