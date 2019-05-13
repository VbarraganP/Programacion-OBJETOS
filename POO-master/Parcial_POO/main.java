/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_POO;

public class main {
    public static void main (String[] args){
        String[] sa={"tom","jerry"};
        for(int x=0;x<3;x++){
            for(String s: sa){
                System.out.print(x+" "+s);
                if(x==1)break;
            }
        }

    }
}
