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
public class karyawanTetap extends karyawan{
    private double gaji;
    private double tunjangan;
    private double total;

    public karyawanTetap(double gaji, double tunjangan, double total, String nama, int jenis) {
        super(nama, jenis);
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.total = total;
    }
    

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTunjangan() {
        return tunjangan ;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTotal(){
        return total;
    }
    
    @Override
    public void karyawan(){
        System.out.println("----- Karyawan Tetap -----");
        System.out.println("gaji = "+gaji);
        System.out.println("tunjangan: "+tunjangan);
        System.out.println("total Gaji: "+total);
    }
    
}
