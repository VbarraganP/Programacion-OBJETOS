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
public class main {
    public static void main(String[] args) {
        Animal animal=new Perro("xx","border");
       animal.hacerSonido();
       animal.correr();
       
       Gato gato=new Gato("yy","raza");
       gato.hacerSonido();
       gato.correr();
    }
}
