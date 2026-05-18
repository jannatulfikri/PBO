/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum200426;

/**
 *
 * @author janna
 */
public class Author {
    private final String nama;
    private String email;
    private final char gender;
    
    public Author (String nama, String email, char gender){
        this.nama=nama;
        this.email = email;
        this.gender = gender;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
 
    public String getEmail (){
        return email;
    }
    
    public char getGender (){
        return gender;
    }
    
    public String toString(){
        return nama + "(" + gender + ") at " + email; 
    }
    
            
    
}
