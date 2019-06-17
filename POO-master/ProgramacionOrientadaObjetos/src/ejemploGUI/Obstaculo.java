/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploGUI;

/**
 *
 * @author vbarraganp
 */
public class Obstaculo extends Objeto{
    private boolean activo=true;
    
    public Obstaculo(int x, int y) {
        super(x, y);
    }
    public boolean isActivo(){
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Override
    void mover() {
        
    }
    
}
