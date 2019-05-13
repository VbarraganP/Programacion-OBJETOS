/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados_Nomina;

/**
 *
 * @author victo
 */
public class Empleados {
    private int id;
    private String nombre;
    private String apellido;
    private String genero;
    private int salario;
    private int horas;
    //fechas
    private int nacimiento_dia;
    private int nacimiento_mes;
    private int nacimiento_año;
    
    private int ingreso_dia;
    private int ingreso_mes;
    private int ingreso_año;
    
    public Empleados (int id, String nombre, String apellido,String genero,int salario){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.salario=salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNacimiento_dia() {
        return nacimiento_dia;
    }

    public void setNacimiento_dia(int nacimiento_dia) {
        this.nacimiento_dia = nacimiento_dia;
    }

    public int getNacimiento_mes() {
        return nacimiento_mes;
    }

    public void setNacimiento_mes(int nacimiento_mes) {
        this.nacimiento_mes = nacimiento_mes;
    }

    public int getNacimiento_año() {
        return nacimiento_año;
    }

    public void setNacimiento_año(int nacimiento_año) {
        this.nacimiento_año = nacimiento_año;
    }

    public int getIngreso_dia() {
        return ingreso_dia;
    }

    public void setIngreso_dia(int ingreso_dia) {
        this.ingreso_dia = ingreso_dia;
    }

    public int getIngreso_mes() {
        return ingreso_mes;
    }

    public void setIngreso_mes(int ingreso_mes) {
        this.ingreso_mes = ingreso_mes;
    }

    public int getIngreso_año() {
        return ingreso_año;
    }

    public void setIngreso_año(int ingreso_año) {
        this.ingreso_año = ingreso_año;
    }
    
}
