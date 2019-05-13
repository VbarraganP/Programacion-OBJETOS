/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloPOO;

/**
 *
 * @author vbarraganp
 */
public class PruebaRectangulo {
    public static void main (String[]arg){
        Rectangulo r1=new Rectangulo (10,20);
        Rectangulo r2=new Rectangulo (15,25);
        
        double area1= r1.calcularArea();
        double area2= r2.calcularArea();
        
        double perimetro1= r1.calcularPerimetro();
        double perimetro2= r2.calcularPerimetro();
        
        System.out.println("Area primer rectangulo: "+area1);
        System.out.println("Area segundo rectangulo: "+area2);
        
        System.out.println("Perimetro primer rectangulo: "+perimetro1);
        System.out.println("Perimetro segundo rectangulo: "+perimetro2);
    }
}
