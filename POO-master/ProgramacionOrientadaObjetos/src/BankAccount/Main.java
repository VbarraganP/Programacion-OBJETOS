/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author vbarraganp
 */
public class Main {
    public static void main(String[] args){
        BankAccount.incrementCount();
        BankAccount.incrementCount();
        BankAccount b1=new BankAccount();
        System.out.println(b1.getNumber());
        System.out.println(BankAccount.getCount());
    }
}
