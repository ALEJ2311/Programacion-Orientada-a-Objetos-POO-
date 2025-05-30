/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Estudiantes implements Serializable  {

    private String nombre;
    private String cedula;
    private int edad;
    private String[] materias;
    private double[] notas;
    private double promedio;
    private String promCualitativo;

    public Estudiantes() {

    }

    public Estudiantes(String nombre, String cedula, int edad, String[] materias, double[] notas, double promedio, String promCualitativo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.materias = materias;
        this.notas = notas;
        this.promedio = promedio;
        this.promCualitativo = promCualitativo;
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

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double[] notes) {
        double suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma += notes[i];

        }
        this.promedio = suma / notes.length;
    }

    public String getPromCualitativo() {
        return promCualitativo;
    }

    public void setPromCualitativo() {
        double prom = this.getPromedio();
        if (prom >= 7 && prom <= 10) {
            this.promCualitativo = "EXCELENTE";
        } else {
            this.promCualitativo = "MALO";
        }

    }

    public void llenarDatos(int limite) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        this.nombre = tcl.nextLine();
        System.out.println("Ingrese su cedula:");
        this.cedula = tcl.nextLine();
        System.out.println("Ingrese su edad: ");
        this.edad = tcl.nextInt();
        tcl.nextLine();
        String[] nomM = new String[limite];
        double[] notes = new double[limite];
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Ingrese el nombre de la materia " + (i + 1));
            nomM[i] = tcl.nextLine();
            System.out.println("Ingrese su nota en esa materia: ");
            notes[i] = tcl.nextDouble();
        }
        this.setMaterias(nomM);
        this.setNotas(notes);
        this.setPromedio(notes);
        this.setPromCualitativo();

    }

    public void verificarCedula() {
        int numeros[] = new int[cedula.length()];
        int bandera = 2;
        int multi = 0;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            numeros[i] = Character.getNumericValue(cedula.charAt(i));
        }
        for (int i = 0; i < 9; i++) {
            if (bandera == 2) {
                multi = numeros[i] * 2;
                if (multi >= 10) {
                    multi -= 9;
                }
                bandera = 1;
            } else {
                if (bandera == 1) {
                    multi = numeros[i];
                }
            }
            sum += multi;
        }
        int residuo = sum %10;
        int digitoVerifi = (residuo == 0)? 0: 10 - residuo;
        System.out.println("digito verificador: " + numeros[9]);
        System.out.println("digito calculado " + digitoVerifi);
        if (digitoVerifi == numeros[9]) {
            System.out.println("Cedula valida");
        }else{
            System.out.println("Cedula Invalida");
        }
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", materias=" + Arrays.toString(materias) + ", notas=" + Arrays.toString(notas) + ", promedio=" + promedio + ", promCualitativo=" + promCualitativo + '}';
    }

}
