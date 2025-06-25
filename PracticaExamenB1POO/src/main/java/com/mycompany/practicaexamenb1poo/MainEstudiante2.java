/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainEstudiante2 {
    static Scanner tcl = new Scanner (System.in);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Ingresa el numero de estudiantes:");
        int limite = tcl.nextInt();
        System.out.println("Ingresa el numero de materias:");
        int numMat = tcl.nextInt();
        tcl.nextLine();
        Estudiante[] estudiante = new Estudiante[limite];
        
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("Estudiante " + (i+1));
            estudiante[i] = new Estudiante();
            estudiante[i].llenarDatos(numMat);
        }
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println(estudiante[i].toString());
        }
    }
    
}
