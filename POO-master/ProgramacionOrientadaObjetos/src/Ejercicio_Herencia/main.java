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
import java.util.*;

public class main {
    public static void main(String[] args) {
        Empresa empresa=new Empresa();
        Camioneta camioneta =
                new Camioneta (80, 4, 2, "XCR254", 2017, 123, "pollito", 2000000);
        Vagoneta vagoneta = 
                new Vagoneta(8, "VFD785", 2017, 345, "pollito", 4000000);
        empresa.registrarAuto(vagoneta);
        empresa. registrarAuto(camioneta);
        HashMap <String,Auto> autos=
                empresa.listarAutos();
        for(Auto auto: autos.values()){
            System.out.println(auto.getNroSerie());
            System.out.println(auto.getPlaca());
        }
    }
}
