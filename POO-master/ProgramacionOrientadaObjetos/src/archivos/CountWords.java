/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author vbarraganp
 */
public class CountWords {
    public static void main(String[] args) 
        throws FileNotFoundException {
        Scanner input = new Scanner (new File ("Hamlet.txt"));
        int count =0;
        while( input.hasNext ()){
            String word = input.next();
            count++;
        }
        System.out.println("Cantidad de palabras: "+ count);
        }
    }

