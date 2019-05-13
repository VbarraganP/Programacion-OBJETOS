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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return this.base*this.altura;
    }
    public double calcularPerimetro(){
        return (this.base+this.altura)*2;
    }
    
}
