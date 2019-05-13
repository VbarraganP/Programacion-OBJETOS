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
public class Auto {
    protected String placa;
    protected int anio;
    protected int nroSerie;
    protected String marca;
    protected double precio;

    public Auto(String placa, int anio, int nroSerie, String marca, double precio) {
        this.placa = placa;
        this.anio = anio;
        this.nroSerie = nroSerie;
        this.marca = marca;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

