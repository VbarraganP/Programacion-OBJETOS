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
public class Llanta extends Objeto {

    public Llanta(int x, int y) {
        super(x, y);
    }

    @Override
    void mover() {
        this.x++;
    }
    
}
