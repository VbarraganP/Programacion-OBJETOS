/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author vbarraganp
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class main {
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\vbarraganp\\Documents\\NetBeansProjects\\Programacion-OBJETOS\\POO-master\\ProgramacionOrientadaObjetos\\src\\archivos\\Hamlet");
        int numLigas =0;
        int numEquipos=0;
        ArrayList<Liga>ligas=new ArrayList <>();
        String nombreLiga=null;
        try{
            Scanner input = new Scanner (f);
            if(input.hasNextInt()){
                numLigas = input.nextInt();
                System.out.println("Ligas "+ numLigas);
                for(int i=0; i<numLigas; i++){
                    nombreLiga=input.next();
                    Liga lig=new Liga("Liga : "+nombreLiga);
                    System.out.println(nombreLiga);
                    numEquipos=input.nextInt();
                    System.out.println("Numero de equipos: "+ numEquipos);
                    for(int j =0;j<numEquipos;j++){
                        String Equip=input.next();
                        lig.addequipos(Equip);
                        System.out.println(Equip);
                    }
                    ligas.add(lig);
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("No existe el archivo");
        }
        File archivoSalida =new File ("C:\\Users\\vbarraganp\\Documents\\NetBeansProjects\\Programacion-OBJETOS\\POO-master\\ProgramacionOrientadaObjetos\\src\\archivos\\Salida.txt");
        PrintStream salida = null;
        if(!archivoSalida.exists()){
            try {
                archivoSalida.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            try {
                
                salida=new PrintStream(archivoSalida);
                for(Liga liga : ligas){
                    for(Equipo equipo: liga.getequipos())
                        salida.println(equipo.getNombre());
                }
                salida.flush();
                salida.close();
            }catch(IOException ex){}
                
            
        
    }
}
