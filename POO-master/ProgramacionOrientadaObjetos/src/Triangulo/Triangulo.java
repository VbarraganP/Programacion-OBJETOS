/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

/**
 *
 * @author vbarraganp
 */
public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private color colorLinea;
    private color colorRelleno;
    
    public void cambiarColor(){
        
    }
   
    public double calcularAltura(){
        int altura =0;
        int x=p1.getX();
        
        return altura;
    }
    public double calcularArea(){
        
        int area =0;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro=0,ax=0,ay=0,bx=0,by=0,cx=0,cy=0,a=0,b=0,c=0;
        ax=(p1.getX()-p2.getX());
        ay=(p1.getY()-p2.getY());
        a=(ax*ax)+(ay*ay);
        a=Math.sqrt(a);
        
        bx=(p2.getX()-p3.getX());
        by=(p2.getY()-p3.getY());
        b=(bx*bx)+(by*by);
        b=Math.sqrt(b);
        
        cx=(p3.getX()-p1.getX());
        cy=(p3.getY()-p1.getY());
        c=(cx*cx)+(cy*cy);
        c=Math.sqrt(c);
        
        perimetro=a+b+c;
        return perimetro;
    }
    public void dibujar(){
        
    }
    
}
