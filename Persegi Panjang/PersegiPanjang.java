/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum300326;

/**
 *
 * @author LAB-SI-PC
 */
public class PersegiPanjang {
    int panjang,lebar;
    
    //kontruktor
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a, int b) {
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
    return (panjang*lebar);
    }
    
    int hitungKeliling (){
        return (2*(panjang*lebar));
    }
        
    
}
