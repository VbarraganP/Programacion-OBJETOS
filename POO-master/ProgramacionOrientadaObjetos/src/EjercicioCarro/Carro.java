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
    private Eje[] eje;
    private Motor motor;
    
    public Carro(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }
   public void addMotor(int potencia){
 //      motor=new Motor (1000,eje);
   }
   public void AñadirEje(Eje[] eje){
       this.eje=eje;
   }
   public void AñadirLlantas(Llanta[] llantas){
       this.llantas=llantas;
   }
   
}