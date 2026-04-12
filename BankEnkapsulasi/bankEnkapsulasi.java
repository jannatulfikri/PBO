/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum060426;

/**
 *
 * @author janna
 */
public class bankEnkapsulasi {
    private String norek;
    private String nama;
    private double saldo = 1000000;
    
    
    public bankEnkapsulasi(){
        
    }
    public bankEnkapsulasi(String norek, String nama){
        this.nama=nama;
        this.norek=norek;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void setNorek(String norek){
        this.norek=norek;
    }
    public String getNorek(String norek){
        return norek;
    }
    
    public double getSaldo(){
        return saldo;
    }
            
    public void deposit (double jumlah){
        saldo+=jumlah;
        System.out.println("Deposit berhasil    = "+jumlah);
        System.out.println("Saldo anda sekarang = "+saldo);
    }
    public void withdraw (double jumlah){
        if (jumlah <= saldo){
            saldo-=jumlah;
            System.out.println("Withdraw berhasil sebanyak= "+jumlah);
            System.out.println("Saldo anda                = "+saldo);            
        }
        else {
            System.out.println("Saldo tidak cukup");
        }
    }
            
    
    
}
