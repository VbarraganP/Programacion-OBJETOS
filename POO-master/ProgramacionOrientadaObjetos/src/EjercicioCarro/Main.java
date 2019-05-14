/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCarro;


public class Main {
    public static void main(String[] args) {
        
        Llanta[] llantas=new Llanta[4]; 
        llantas[0]=new Llanta("miche","20");
        llantas[1]=new Llanta("miche","20");
        llantas[2]=new Llanta("miche","20");
        llantas[3]=new Llanta("miche","20");
        
        Eje[] ejes=new Eje[2];
        ejes[0]=new Eje("pollito");
        ejes[1]=new Eje("pollito");
        
        Carro miCarrito=new Carro("XXX","pollito",1000);
        
        miCarrito.AñadirEje(ejes);
        miCarrito.AñadirLlantas(llantas);
        
        System.out.println(miCarrito);
        
        
    }
}
