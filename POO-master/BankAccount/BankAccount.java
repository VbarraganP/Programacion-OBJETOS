/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

public class BankAccount {
    //Instancia
    private int accountNumber;
    //Clase
    private static int count;
    
    public int getNumber(){
        return this.accountNumber;
        
    }
    static void incrementCount(){
        //Desde un "public static" solo puede llamar variables que sean estaticas 
        count++;
        //es un zona global de memoria , la cual es igual para todas las instancias,
        //porque es un metodo de la clase
    }
    public static int getCount(){
        return count;
    }
}
