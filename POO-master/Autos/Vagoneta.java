/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaAutos;

/**
 *
 * @author vbarraganp
 */
public class Vagoneta extends Auto {
    private int nroPasajero; 

    public Vagoneta(int nroPasajero, String placa, int anio, int nroSerie, String marca, double precio) {
        super(placa, anio, nroSerie, marca, precio);
        this.nroPasajero = nroPasajero;
    }

    public int getNroPasajero() {
        return nroPasajero;
    }

    public void setNroPasajero(int nroPasajero) {
        this.nroPasajero = nroPasajero;
    }
    
}
