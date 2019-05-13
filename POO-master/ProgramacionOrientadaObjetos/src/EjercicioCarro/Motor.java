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
public class Motor {
    private int potencia;
    private Eje eje;

    public Motor(int potencia) {
        this.potencia = potencia;
    }
    
    public void añadirEje(Eje eje){
        this.eje=eje;
    }

    public int obtenerPotencia() {
        return potencia;
    }

    public Eje obtenetEje() {
        return eje;
    }

}
