/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8_poo_b1;

/**
 *
 * @author Personal
 */
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Estudiante implements Serializable {

    private String nombre;
    private int ciclo;
    private String[] materias;
    private double promedio;
    private int numAprovado;
    private int numReprovado;
    private double[] notas;
    public transient Scanner tcl = new Scanner(System.in);

    public Estudiante() {
    }

    public Estudiante(String nombre, int ciclo, String[] materias, double promedio, int numAprovado, int numReprovado, double[] notas) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.materias = materias;
        this.promedio = promedio;
        this.numAprovado = numAprovado;
        this.numReprovado = numReprovado;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public String[] getMaterias() {
        return materias;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getNumAprovado() {
        return numAprovado;
    }

    public int getNumReprovado() {
        return numReprovado;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        this.promedio = suma / notas.length;
    }

    public void setNumAprovado(double[] notas) {
        int apro = 0;
        for (double nota : notas) {
            if (nota >= 7) {
                apro++;
            }
        }
        this.numAprovado = apro;
    }

    public void setNumReprovado(double[] notas) {
        int repro = 0;
        for (double nota : notas) {
            if (nota < 7) {
                repro++;
            }
        }
        this.numReprovado = repro;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void llenarMaterias(int limite) {
        String[] materias = new String[limite];
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese materia " + (i + 1));
            materias[i] = tcl.nextLine();
        }
        this.setMaterias(materias);
    }

    public void llenarNotas(int limite) {
        double[] notas = new double[limite];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese la nota " + (i + 1));
            notas[i] = tcl.nextDouble();
        }
        this.setNotas(notas);
        this.setPromedio(notas);
        this.setNumAprovado(notas);
        this.setNumReprovado(notas);
    }

    @Override
    public String toString() {
        return "----------------------------\n"
                + "  Estudiante Información\n"
                + "----------------------------\n"
                + " Nombre:      '" + nombre + "'\n"
                + " Ciclo:       " + ciclo + "\n"
                + " Materias:    " + Arrays.toString(materias) + "\n"
                + " Promedio:    " + promedio + "\n"
                + " Aprobados:   " + numAprovado + "\n"
                + " Reprobados:  " + numReprovado + "\n"
                + " Notas:       " + Arrays.toString(notas) + "\n"
                + "----------------------------";
    }
}
