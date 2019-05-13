/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCarro;
/**
 *
 * @author vbarraganp
 */
public class Carro {
    private String placa;
    private String marca;
    private Llanta[] llantas;
    private Eje[] ejes;
    private Motor motor;
    
    public Carro(String placa, String marca,int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.motor=new Motor(potencia);
    }
   public void AñadirEje(Eje[] eje){
       this.ejes=eje;
       //relacion eje-motor / motor-eje
       
   }
   public void AñadirLlantas(Llanta[] llantas){
       this.llantas=llantas;
   }
   public Llanta[] obtenerLlantas(){
       return this.llantas;
   }
}