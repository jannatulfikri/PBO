/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum180526;

/**
 *
 * @author janna
 */
public class pembayaranTunai extends pembayaran implements cetak{
    private double uang;

    public pembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }
    
    

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }
    
    
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui Tunai");
        System.out.println("Cash id: "+ idTransaksi);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
        
        if (uang>= jumlahBayar){
            double kembalian = uang-jumlahBayar;
        System.out.println("Pembayaran berhasil \nUang kembalian = Rp"+kembalian);
    }else {
            double kekurangan = jumlahBayar - uang;
        System.out.println("Pembayaran Gagal, uang anda kurang \n kekurangan sebesar = Rp"+kekurangan);
    }
    }
    
    @Override
    public void cetakStruk(){
        System.out.println("\n bukti pembayaran tunai ");
        System.out.println("Pembayaran melalui Tunai");
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
        System.out.println("Pembayaran dilakukan secara cash");
    }
}
