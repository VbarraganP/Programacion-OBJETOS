/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Herencia;

/**
 *
 * @author vbarraganp
 */
public class Camioneta extends Auto{
    private int capacidadCarga; 
    private int cantidadEjes;
    private int nroRobados;

    public Camioneta(int capacidadCarga, int cantidadEjes, int nroRobados, String placa, int anio, int nroSerie, String marca, double precio) {
        super(placa, anio, nroSerie, marca, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
        this.nroRobados = nroRobados;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getNroRobados() {
        return nroRobados;
    }

    public void setNroRobados(int nroRobados) {
        this.nroRobados = nroRobados;
    }
    
}
