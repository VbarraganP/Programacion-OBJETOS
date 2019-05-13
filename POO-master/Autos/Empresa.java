/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaAutos;

import java.util.*;
public class Empresa {
    private HashMap <String,Auto> autos;
    public Empresa (){
        this.autos =new HashMap<>();
    }
    public void registrarAuto(Auto auto){
        this.autos.put(auto.getPlaca(), auto);
    }
    public HashMap listarAutos(){
        
        return this.autos;
        
    }
}
