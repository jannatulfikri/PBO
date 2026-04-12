/*
 * nama: Jannatul Fikri
 * kelas: TK1A
* 2501082013
 */
package pratikum060426;

/**
 *
 * @author janna
 */
public class persegiPanjangEnkapsulasi {
   private int panjang;
   private int lebar;
   private static int jumlahObjek = 0;
   
   public persegiPanjangEnkapsulasi (){
       jumlahObjek++;
    }
   public persegiPanjangEnkapsulasi (int panjang, int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
    jumlahObjek++;
    }
   
    public void setPanjang(int panjang) {
    this.panjang = panjang;
    }
   
    public int getPanjang (){
       return panjang;
    }
   
   
    public void setLebar(int lebar) {
    this.lebar = lebar;
    }
   
    public int getLebar (){
       return lebar;
    }
   
   
   public static int getJumlahObjek (){
       return jumlahObjek;
   }
   
   public int getLuas(){
       return (panjang*lebar);
   }
   
   public int getKeliling (){
       return 2*(panjang+lebar);
   }
   

}