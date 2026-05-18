/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum300326.mahasiswa;

/**
 *
 * @author LAB-SI-PC
 */
public class kelasMahasiswa {
  
    int tugas,uts,uas;
    //kontruktor
    kelasMahasiswa(){
        
    }
    kelasMahasiswa(int a, int b, int c){
        tugas = a;
        uts = b;
        uas = c;
    }
    
    //method
    int hitungNilaiAkhir(){
        return (int) ((tugas*0.25)+(uts*0.35)+(uas*0.4));
    }
}
