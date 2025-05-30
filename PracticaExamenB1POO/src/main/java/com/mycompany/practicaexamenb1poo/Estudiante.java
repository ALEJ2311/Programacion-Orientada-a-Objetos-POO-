/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Estudiante {
    private String nombre;
    private String cedula;
    private int edad;
    private String []materias;
    private double [] notas;
    private double promedio;
    private String promCualitativo;
    
    public Estudiante(){
        
    }

    public Estudiante(String nombre, String cedula, int edad, double[] notas, double promedio, String promCualitativo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.notas = notas;
        this.promedio = promedio;
        this.promCualitativo = promCualitativo;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] nomMat) {
        this.materias = nomMat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notes) {
        this.notas = notes;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double[] notes ) {
        double sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }
        this.promedio = sum/ notes.length ;
    }

    public String getPromCualitativo() {
        return promCualitativo;
    }

    public void setPromCualitativo(double[] notes) {
        double prom = this.getPromedio();
        
            if(prom >= 0 && prom < 7){
                this.promCualitativo = "MALO";
            }else{
                if(prom >= 7 && prom <= 10){
                    this.promCualitativo = "EXCELENTE";
                }
            }
        
    }
    
    public void llenarDatos(int numMat){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        this.nombre = tcl.nextLine();
        System.out.println("Ingrese la cedula:");
        this.cedula = tcl.nextLine();
        System.out.println("Ingrese la edad: ");
        this.edad = tcl.nextInt();
        tcl.nextLine();
        String [] nomMat = new String[numMat];
        double [] notes = new double[numMat];
        for (int i = 0; i < nomMat.length; i++) {
            System.out.println("Ingrese nombre de Materia "  + (i + 1));
            nomMat[i] = tcl.nextLine();
            System.out.println("Ingrese su nota: ");
            notes[i] = tcl.nextInt();
            tcl.nextLine();
        }
        this.setNotas(notes);
        this.setMaterias(nomMat);
        this.setPromedio(notes);
        this.setPromCualitativo(notes);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", materias=" + Arrays.toString(materias) + ", notas=" + Arrays.toString(notas) + ", promedio=" + promedio + ", promCualitativo=" + promCualitativo + '}';
    }
    
    
}

