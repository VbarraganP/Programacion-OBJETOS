/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author vbarraganp
 */
public class EjemploCarro extends Application{// Application es una clase abstracta
    public static void main(String[] args) {
        Application.launch(args);// Metdo de clase de Application para ejecutar la ventana
    }

    @Override
    public void start(Stage primaryStage) throws Exception {// metodo que se ejecuta para iniciar la aplicacion
        int ancho=600, alto=600;
        //configirar escenario  
        Pane panel = new Pane();
        Canvas tablero = new Canvas (ancho,alto);//Canvas recibe las dimensiones como parametros del constructor
        panel.getChildren().add(tablero);//cada nodo tiene sus hijos
        Scene escena = new Scene (panel,ancho,alto,Color.ANTIQUEWHITE);
        
        
        GraphicsContext lapiz= tablero.getGraphicsContext2D();
        
        //coordenadas 
        int x=0,y=0;
        
        lapiz.fillText("Nicolas", 30, 80);
        
        
        lapiz.setFill(Color.RED);
        lapiz.fillRect(x+110,y+220,200 ,90);
        lapiz.setFill(Color.BLACK);
        lapiz.fillOval(x+140, y+310, 40, 40);
        
        
        
        
        primaryStage.setScene(escena);
        primaryStage.setTitle("Escenario Inte");
        primaryStage.show();
        
        
    }
    
}
