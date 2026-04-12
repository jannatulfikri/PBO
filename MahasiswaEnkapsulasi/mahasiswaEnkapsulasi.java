package pratikum060426;

/**
 *
 * @author janna
 */
public class mahasiswaEnkapsulasi {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;
    
    public mahasiswaEnkapsulasi () {
    
}
    public mahasiswaEnkapsulasi (String nama , String nim){
        this.nama=nama;
        this.nim=nim;
    }
    public mahasiswaEnkapsulasi (String nama, String nim, String jurusan, int umur, double ipk){
        this.nama=nama;
        this.nim=nim;
        this.jurusan=jurusan;
        this.umur=umur;
        this.ipk=ipk;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public String getNim(){
        return nim;
    }
        
    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }
    public String getJurusan(){
        return jurusan;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    public int getUmur(){
        return umur;
    }
    
    public void setIpk(double ipk){
        this.ipk=ipk;
    }
    public double getIpk(){
        return ipk;
    }
    
    public String statusKelulusan (){
        if (ipk >=2.75){
            return "lulus";
        }
        else {
            return "tidak lulus";
        }
    }
    
}
