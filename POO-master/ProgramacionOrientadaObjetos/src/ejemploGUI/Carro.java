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
public class Carro extends Objeto{
    
    private Chasis chasis;
    private Llanta llantadel;
    private Llanta llantatras;
    
    public Carro(int x, int y) {
        super(x, y);
        this.chasis=new Chasis(x,y);
        this.llantadel= new Llanta(x,y);
        this.llantatras=new Llanta(x,y);
    }
    
    @Override
    public void mover(){
        this.x++;
        this.chasis.mover();
        this.llantadel.mover();
        this.llantatras.mover();
        
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Llanta getLlantadel() {
        return llantadel;
    }

    public Llanta getLlantatras() {
        return llantatras;
    }
    
}
