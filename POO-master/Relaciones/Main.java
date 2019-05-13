/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

/**
 *
 * @author vbarraganp
 */
public class Main {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante (1,"salome");
        Curso c1 =new Curso(1,"POO",4);
        //Asociacion
        c1.setEstudiante(e1);
        
        Curso c2=new Curso (2,"calculo",4);
        
        System.out.println(c1.getEstudiante().getNombre());
        System.out.println(c1.getEstudiante().getNombre());
        
        //error NullPointerException
        //if(c2.getEstudiante()!=null)
        System.out.println(c2.getEstudiante().getNombre());
        
    }
}
