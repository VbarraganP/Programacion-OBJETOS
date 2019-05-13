/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados_Nomina;

import java.util.Scanner;

public class _Main_ {
    public static void main(String[] args){
        String nombre,apellido,genero;
        Scanner entrada  = new Scanner( System.in);
        System.out.println("PRIMER EMPLEADO");
        System.out.print("Nombre: ");
        nombre= entrada.nextLine();
        System.out.print("Apellido: ");
        apellido= entrada.nextLine();
        System.out.print("Genero: ");
        genero= entrada.nextLine();
        Empleados E1=new Empleados(0,nombre,apellido,genero,1000000);
        System.out.println("FECHA NACIMIENTO:");
        System.out.print("Dia: ");
        int dia= entrada.nextInt();
        E1.setNacimiento_dia(dia);
        System.out.print("Mes: ");
        int mes= entrada.nextInt();
        E1.setNacimiento_mes(mes);
        System.out.print("Año: ");
        int año= entrada.nextInt();
        E1.setNacimiento_año(año);
        System.out.println("FECHA INGRESO");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        E1.setIngreso_dia(dia);
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        E1.setIngreso_mes(mes);
        System.out.print("Año: ");
        año= entrada.nextInt();
        E1.setIngreso_año(año);
        
        //-----------------------------------------------------------------
        System.out.println("SEGUNDO EMPLEADO");
        System.out.print("Nombre: ");
        nombre= entrada.nextLine();
        System.out.print("Apellido: ");
        apellido= entrada.nextLine();
        System.out.print("Genero: ");
        genero= entrada.nextLine();
        Empleados E2=new Empleados(1,nombre,apellido,genero,1000000);
        System.out.println("FECHA NACIMIENTO:");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        E2.setNacimiento_dia(dia);
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        E2.setNacimiento_mes(mes);
        System.out.print("Año: ");
        año= entrada.nextInt();
        E2.setNacimiento_año(año);
        System.out.println("FECHA INGRESO");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        E2.setIngreso_dia(dia);
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        E2.setIngreso_mes(mes);
        System.out.print("Año: ");
        año= entrada.nextInt();
        E2.setIngreso_año(año);
        
        
        //----------------------------------------------------------------
        System.out.println("TERCER EMPLEADO");
        System.out.print("Nombre: ");
        nombre= entrada.nextLine();
        System.out.print("Apellido: ");
        apellido= entrada.nextLine();
        System.out.print("Genero: ");
        genero= entrada.nextLine();
        Empleados E3=new Empleados(2,nombre,apellido,genero,1000000);
        System.out.println("FECHA NACIMIENTO:");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        E3.setNacimiento_dia(dia);
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        E3.setNacimiento_mes(mes);
        System.out.print("Año: ");
        año= entrada.nextInt();
        E3.setNacimiento_año(año);
        System.out.println("FECHA INGRESO");
        System.out.print("Dia: ");
        dia= entrada.nextInt();
        E3.setIngreso_dia(dia);
        System.out.print("Mes: ");
        mes= entrada.nextInt();
        E3.setIngreso_mes(mes);
        System.out.print("Año: ");
        año= entrada.nextInt();
        E3.setIngreso_año(año);
        
        //--------------------------------------------------------------
        int menu;
        System.out.println("Ingrese (1) para calcular la nomina");
        System.out.println("Ingrese (2) para añadir horas");
        System.out.println("Ingrese (3) para cambiar salarios");
        System.out.println("Ingrese (4) para ver la antiguedad");
        System.out.println("Ingrese (0) para terminar el programa");
        while(true){
            int identificacion;
            menu=entrada.nextInt();
            switch (menu){
                case 1:
                    int nomina=0;
                    nomina+=E1.getSalario();
                    nomina+=E2.getSalario();
                    nomina+=E3.getSalario();
                    System.out.println("Primer Empleado: "+E1.getSalario());
                    System.out.println("Segundo Empleado: "+E2.getSalario());
                    System.out.println("Tercer Empleado: "+E3.getSalario());
                    System.out.println("La Nomina es: " + nomina);
                    break;
                case 2:
                    System.out.println(" Ingrese el numero de indentificacion del empleado");
                    identificacion =entrada.nextInt();
                    if(identificacion == (E1.getId())){
                        int horas;
                        System.out.println("Ingrese las horas");
                        horas=entrada.nextInt();
                        if(horas>0){
                            E1.setHoras(horas);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    if(identificacion == (E2.getId())){
                        int horas;
                        System.out.println("Ingrese las horas");
                        horas=entrada.nextInt();
                        if(horas>0){
                            E2.setHoras(horas);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    if(identificacion == (E3.getId())){
                        int horas;
                        System.out.println("Ingrese las horas");
                        horas=entrada.nextInt();
                        if(horas>0){
                            E3.setHoras(horas);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Ingrese el numero de indentificacion del empleado");
                    identificacion =entrada.nextInt();
                    if(identificacion == (E1.getId())){
                        int salario;
                        System.out.println("Ingrese el salario");
                        salario=entrada.nextInt();
                        if(salario>0){
                            E1.setSalario(salario);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    if(identificacion == (E2.getId())){
                        int salario;
                        System.out.println("Ingrese el salario");
                        salario=entrada.nextInt();
                        if(salario>0){
                            E2.setSalario(salario);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    if(identificacion == (E3.getId())){
                        int salario;
                        System.out.println("Ingrese el salario");
                        salario=entrada.nextInt();
                        if(salario>0){
                            E3.setSalario(salario);
                        }else{
                            System.out.println("No fue posible realizar la operacion");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Primer Empleado: ");
                    System.out.println("Nombre: "+E1.getNombre()+E1.getApellido());
                    System.out.println("Fecha de nacimiento: "+E1.getNacimiento_dia()+" / "+E1.getNacimiento_mes()+" / "+E1.getNacimiento_año());
                    int edad,antiguedad;
                    edad=2019-(E1.getNacimiento_año());
                    antiguedad=2019-(E1.getIngreso_año());
                    System.out.println("EDAD: "+edad+" Años");
                    System.out.println("ANTIGUEDAD: "+antiguedad+" Años");
                    
                    System.out.println("Segundo Empleado:");
                    System.out.println("Nombre: "+E2.getNombre()+E2.getApellido());
                    System.out.println("Fecha de nacimiento: "+E2.getNacimiento_dia()+" / "+E2.getNacimiento_mes()+" / "+E2.getNacimiento_año());
                    edad=2019-(E2.getNacimiento_año());
                    antiguedad=2019-(E2.getIngreso_año());
                    System.out.println("EDAD: "+edad+" Años");
                    System.out.println("ANTIGUEDAD: "+antiguedad+" Años");
                    
                    System.out.println("Tercer Empleado:");
                    System.out.println("Nombre: "+E3.getNombre()+E3.getApellido());
                    System.out.println("Fecha de nacimiento: "+E3.getNacimiento_dia()+" / "+E3.getNacimiento_mes()+" / "+E3.getNacimiento_año());
                    edad=2019-(E3.getNacimiento_año());
                    antiguedad=2019-(E3.getIngreso_año());
                    System.out.println("EDAD: "+edad+" Años");
                    System.out.println("ANTIGUEDAD: "+antiguedad+" Años");
                    
                    break;
                case 0:
                    System.exit(0);
                    break;
                
            }
            
        }
    }
}

