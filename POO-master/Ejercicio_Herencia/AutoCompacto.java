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
public class AutoCompacto extends Auto{
    private int nropasajeros;

    public AutoCompacto(int nropasajeros, String placa, int anio, int nroSerie, String marca, double precio) {
        super(placa, anio, nroSerie, marca, precio);
        this.nropasajeros = nropasajeros;
    }

    public int getNropasajeros() {
        return nropasajeros;
    }

    public void setNropasajeros(int nropasajeros) {
        this.nropasajeros = nropasajeros;
    }
    
}