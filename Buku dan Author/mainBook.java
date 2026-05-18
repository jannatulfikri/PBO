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
public class mainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we need an Author intence to create a book instance
        Author Rin = new Author ("Rinaldi Munir","rinaldi@gmail.com" , 'm');
                System.out.println(Rin);
                
        Book dummyBook = new Book ("Algoritma dan Pemrograman",Rin,98000 ,99);
        System.out.println(dummyBook);
        
        //tes getter dan setter
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is: "+ dummyBook.getNama());
        //name is algoritma dan pemograman
        System.out.println("price is: "+ dummyBook.getPrice());
        //price is 120000
        System.out.println("Qty is: "+ dummyBook.getQty());
        System.out.println("author is: "+ dummyBook.getAuthor());
        System.out.println("author's name is: "+ dummyBook.getAuthor().getNama());
        //author name is Rinaldi Munir
        System.out.println("author's email is: "+ dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is: "+ dummyBook.getAuthor().getGender());
        
        Book moreDummyBook = new Book("java for dummies",
        new Author("Peter Lee" , "peter@nowhere.com", 'm'),19.99 , 8);
        System.out.println(moreDummyBook); //book's toString()
        
    }
    
}
