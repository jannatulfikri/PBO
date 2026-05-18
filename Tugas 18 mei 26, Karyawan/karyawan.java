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
public abstract class karyawan {
    protected String nama;
    protected int jenis;

    public karyawan(String nama, int jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }
    
    public abstract void karyawan();
    
}
