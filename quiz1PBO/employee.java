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
public class employee {
    private int id;
    private String firstName ;
    private String lastName;
    private int salary;
    
    public employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId (){
        return id;
    }
    public String getFirst(){
        return firstName;
    }
    public String getLast(){
        return lastName;
    }
    public String getName(){
        return (firstName + lastName);
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        this.salary+=this.salary * percent/100;
        return this.salary;
    }
    @Override
    public String toString(){
        return "Employee [id = " + id + "   nama = " + getName() + "   salary = "+ salary +"]";
    }
    
    
}
