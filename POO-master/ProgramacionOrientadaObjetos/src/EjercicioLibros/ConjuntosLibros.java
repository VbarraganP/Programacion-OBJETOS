/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioLibros;

/**
 *
 * @author vbarraganp
 */
public class ConjuntosLibros {
    private Libro[] libros;
    public ConjuntosLibros() {
        
    }
    public boolean añadirLibro (Libro libro){
        for(int i =0;i<libros.length;i++){
            if((this.libros[i]==null)&&(false)){
                this.libros[i]=libro;
                return true;
            }
        }
        return false;
    }
 /*   
    public boolean eliminarAutor(String autor){
        return false;
    }
    public boolean eliminarTitulo(String Titulo){
        
    }
    public Libro[] mostrarMayorCalificacion(){
        
    }
    public Libro[] mostrarMenorCalificacion(){
        
    }
    public Libro[] mostrarLibros(){
        
    }
    public boolean comprobarLibros(){
        
    }
    */
}
