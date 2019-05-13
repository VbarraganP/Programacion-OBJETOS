/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCarro;


public class Main {
    public static void main(String[] args) {
        Eje[] eje1=new Eje[0];
        Eje[] eje2=new Eje[1];
        
        Carro miCarrito=new Carro("XXX","pollito",1000);
        miCarrito.AñadirEje(eje1);
        miCarrito.AñadirEje(eje2);
    }
}
