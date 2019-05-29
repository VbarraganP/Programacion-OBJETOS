/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArchivos;

/**
 *
 * @author vbarraganp
 */
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File f=new File ("x");
        if(f.exists()){
            
            System.out.println("Existe");
            nicolas(f);
        }else{
            System.out.println("No existe");
        }
       /* if(f.exists()==true){
            System.out.println("Existe y longitud es"+ f.length());
            for(int i=0; i< f.length();i++){
                System.out.println(f.);
            }
        }else{
            System.out.println(" No Existe");
        }
        f.length();
*/
    }
    public static void nicolas (File f){
        if(f.isDirectory()){
            System.out.println("carpeta: "+f.getName());
            String[] carpetas= f.list();
            for(String carpeta: carpetas){
                File f2= new File(f.getAbsolutePath()+"/"+carpeta);
                nicolas(f2);
            }
        }else{
            System.out.println(" Archivo: "+ f.getName());
        }
    }
   
}
