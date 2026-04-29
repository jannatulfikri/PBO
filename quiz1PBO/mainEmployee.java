/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1PBO;

/**
 *
 * @author janna
 */
public class mainEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee emp = new employee (101 , "janna", "fikri",6000000);
        
        System.out.println("data awal   ");
        System.out.println(emp.toString());
        
        
        System.out.println("= setelah naik = ");
        emp.raiseSalary(10);
        
        System.out.println(emp.toString());
        
    }
    
}
