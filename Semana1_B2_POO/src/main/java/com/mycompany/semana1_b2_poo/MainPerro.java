/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana1_b2_poo;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MainPerro {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS:");
        System.out.println("Ingrese el tipo: ");
        String tipo = tcl.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Ingrese su raza: ");
        String raza = tcl.nextLine();
        System.out.println("");
        Perro p = new Perro(tipo, edad, "", raza);
        p.describir();
        p.ladrar();
        p.Pr();
        p.vacunas();
        System.out.println("Ejemplo de Herencia");
        
    }
}
