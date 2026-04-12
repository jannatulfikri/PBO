/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum060426;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class mainBankEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bankEnkapsulasi nsb = new bankEnkapsulasi();
       Scanner in = new Scanner(System.in);
       
       System.out.println ("masukkan nama= ");
       nsb.setNama(in.nextLine());
       System.out.print("masukkan nomor rekening= ");
       nsb.setNorek(in.nextLine());
       
       int pil;
       System.out.println("===== MENU =====");
       System.out.println("1. cek saldo");
       System.out.println("2. withdraw");
       System.out.println("3. deposit");
       pil = in.nextInt();
       
      
       switch (pil){
           case 1: 
               System.out.print("Saldo anda= "+ nsb.getSaldo());
               break;
           case 2:
               System.out.print("masukkan jumlah withdraw=  ");
               double wd = in.nextDouble();
               nsb.withdraw(wd);
               break;
           case 3: System.out.print("masukkan jumlah deposit=  ");
               double dp = in.nextDouble();
               nsb.deposit(dp);
               break;
    }
  }
}
    
    

