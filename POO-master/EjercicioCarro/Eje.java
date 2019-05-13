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
    private final Llanta[] eje;
    private Motor motor;
    private String marca;
    
    public Eje(String marca){
        this.marca=marca;
        this.eje =new Llanta[2];
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
