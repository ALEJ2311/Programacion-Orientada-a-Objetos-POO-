/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;
    private int anoIng;
    private double promGen;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, String carrera, int anoIng, double promGen) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.anoIng = anoIng;
        this.promGen = promGen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setAnoIng(int anoIng) {
        this.anoIng = anoIng;
    }

    public void setPromGen(double promGen) {
        this.promGen = promGen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getAnoIng() {
        return anoIng;
    }

    public double getPromGen() {
        return promGen;
    }
    
    public String getStatus(){
        if(promGen < 7){
            return "Reprobado";
        }else{
            return "Aprobado";
        }
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(tcl.nextLine());
        System.out.print("Ingrese la edad el estudiante: ");
        estudiante.setEdad(tcl.nextInt());
        tcl.nextLine();
        System.out.print("Ingrese el nombre de la Carrera");
        estudiante.setCarrera(tcl.nextLine());
        System.out.print("Ingrese le año de ingreso: ");
        estudiante.setAnoIng(tcl.nextInt());
        System.out.print("Ingrese su promedio general: ");
        estudiante.setPromGen(tcl.nextDouble());

        System.out.println("--DATOS DEL ESTUDIANTE---");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Año de Ingreso: " + estudiante.getAnoIng());
        System.out.println("Promedio General: " + estudiante.getPromGen());
        System.out.println("Estatus Academico: " + estudiante.getStatus());
    }
}
