/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7_b1_poo;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PrLibretas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numCalifi = 0;
        //double [] notas = new double[5];
        System.out.println("Ingrese su nombre: ");
        String nombre = tcl.nextLine();
        int [] cedula = new int[10];
        System.out.println("Ingrese su cedula: ");
        for (int i = 0; i < cedula.length; i++) {
            cedula[i] = tcl.nextInt();
        }
        
        System.out.println("Ingrese el numero de calificaciones: ");
        numCalifi = tcl.nextInt();
        
        double [] notas = new double[numCalifi];
         
        for (int i = 0; i < numCalifi; i++) {
            notas[i] = tcl.nextDouble();
        }
        
        
        //Creacion de objeto de la clase libretas
        Libretas libreta = new Libretas(nombre, cedula, "Computacion", notas);
        libreta.mostrarInfo();
        System.out.println("Promedio: " + libreta.promNotas());
        System.out.println("Promedio Cualitativo: " + libreta.promCualitativo());
        System.out.println("Estado: " + libreta.aproRepo());
        
    }
}
