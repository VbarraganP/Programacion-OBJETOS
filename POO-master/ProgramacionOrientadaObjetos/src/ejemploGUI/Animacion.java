/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploGUI;
 

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class Animacion extends AnimationTimer {
     private Carro carro;
     private GraphicsContext Lapiz;
     private ArrayList<Obstaculo> obstaculos;
     private int vida=150;
     private Image fondo =null;
     private Image ovni =null;
     private int secuencia=0;

    public Animacion(GraphicsContext Lapiz) {
        this.Lapiz = Lapiz;
        this.carro= new Carro (0,350);
        this.obstaculos= new ArrayList<>();
        this.fondo=new Image("Imagenes/fondo.png");
        Obstaculo Obs1= new Obstaculo(250,100);
    }
     
     
    @Override
    public void handle(long l) {
        
        Lapiz.clearRect(0, 0, 1024, 520);
        //fondo
        Lapiz.drawImage(fondo,0,0);
        //ovni
        this.ovni=new Image("Imagenes/ufo_"+secuencia+".png");
        Lapiz.drawImage(this.ovni, 0, 0);
        
        //barra de vida
        Lapiz.setFill(Color.BLACK);
        Lapiz.strokeRect(390, 20, 200, 20);
        Lapiz.fillRect(390, 20, this.vida, 20);
        //obstaculos
        
        Lapiz.fillRect(300, 360, 40, 40);

        //carro
        Lapiz.setFill(Color.RED);
        Lapiz.fillRect(this.carro.getX(), this.carro.getY(), 90, 30);
        Lapiz.setFill(Color.BLACK);
        Lapiz.fillOval(this.carro.getLlantatras().getX(),this.carro.getLlantatras().getY()+30, 30, 30);
        Lapiz.fillOval(this.carro.getLlantadel().getX()+60,this.carro.getLlantadel().getY()+30, 30, 30);
        Lapiz.setFill(Color.AQUA);
        //Shape obstaculos y carro
        Shape Carro= new Rectangle(this.carro.getX(), this.carro.getY(),90,30);
        Shape Obst= new Rectangle(300, 360, 40, 40);
        Shape inter= SVGPath.intersect(Carro, Obst);
        if(inter.getLayoutBounds().getWidth()!=-1){
            
            this.vida--;
        }
      
        

        this.carro.mover();
        
        
    }
}
