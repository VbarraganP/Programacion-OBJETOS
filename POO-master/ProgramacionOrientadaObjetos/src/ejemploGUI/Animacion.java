/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploGUI;
 
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Animacion extends AnimationTimer {
     private Carro carro;
     private GraphicsContext Lapiz;

    public Animacion(GraphicsContext Lapiz) {
        this.Lapiz = Lapiz;
        this.carro= new Carro (0,100);
    }
     
     
    @Override
    public void handle(long l) {
        Lapiz.clearRect(0, 0, 600, 600);
        Lapiz.setFill(Color.RED);
        Lapiz.fillRect(this.carro.getX(), this.carro.getY(), 90, 30);
        Lapiz.setFill(Color.BLACK);
        Lapiz.fillOval(this.carro.getLlantatras().getX(),this.carro.getLlantatras().getY()+30, 30, 30);
        Lapiz.fillOval(this.carro.getLlantadel().getX()+60,this.carro.getLlantadel().getY()+30, 30, 30);
        Lapiz.setFill(Color.AQUA);
        Lapiz.fillPolygon(this.carro.getChasis().getX()+20, this.carro.getChasis().getY()+10, 5);
        this.carro.mover();
        
        
    }
}
