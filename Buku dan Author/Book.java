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
public class Book {
    private final String nama;
    private final Author author;
    private double price;
    private int qty;
    
    
    public Book (String nama, Author author, double price, int qty){
        this.nama=nama;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getNama (){
        return nama;
    }
    public Author getAuthor (){
        return author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice (){
        return price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public int getQty(){
        return qty;
    }
    public String toString (){
        return "'" + nama + "' by " + author; //author.toString
    }
    
}
