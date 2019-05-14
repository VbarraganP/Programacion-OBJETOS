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
public class Eje {
    private Motor motor;
    private String marca;
    private Llanta[] llantas;
    
    public Eje(String marca){
        this.marca=marca;
        this.motor=motor;
        this.llantas=llantas;
    }
    
    public void añadirLlantas(Llanta[] llantas){
       this.llantas=llantas; 
    }
    
    public Motor obtenerMotor() {
        return motor;
    }

    public void añadirMotor(Motor motor) {
        this.motor = motor;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void añadirMarca(String marca) {
        this.marca = marca;
    }
    
}
