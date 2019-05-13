/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractAnimales;

/**
 *
 * @author vbarraganp
 */
public class Perro extends Animal {

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guauuu");
    }
    

}
