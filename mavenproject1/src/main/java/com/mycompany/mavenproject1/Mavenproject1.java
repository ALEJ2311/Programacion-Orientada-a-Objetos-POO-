/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Mavenproject1 {
//EN JAVA DEBEMOS INICIALIZAR TODA VARIABLE - PREGUNTA DE EXAMEN 

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Luizzzzz xxx");
        int a = 1;
        int b = 3;
        int res = 0;
        res = a + b;
        int contador = 1;
        /*while(contador <= 100){
            System.out.println(contador + ".NO DEBO LLEGAR TARDE A CLASE ");
            contador++;
        }*/

 /*do {
            System.out.println(contador + ".NO DEBO LLEGAR TARDE A CLASE ");
            contador++;
        } while (contador <= 100);*/
 /*for(int i = 100; i >= 0; i -= 2){
            System.out.println(i+".NO DEBO LLEGAR TARDE A CLASE");
         */
        Scanner tcl = new Scanner(System.in);
        /*int limite = 0;
        System.out.print("Ingrese el limite del ciclo: ");
        limite = tcl.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            System.out.println(i+".NO DEBO LLEGAR TARDE A CLASE");
        }*/
        int edad = 0;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Ud es un niño");
        } else {
            if (edad > 12 && edad <= 17) {
                System.out.println("Ud es un joven");
            } else {
                if (edad > 17 && edad <= 60) {
                    System.out.println("Ud es un Adulto");
                } else {
                    if (edad > 60) {
                        System.out.println("Ud es un Adulto Mayor");
                    } else {
                        if (edad < 0) {
                            System.out.println("La edad no puede ser negativa");
                        }
                    }

                }
            }
        }

    }
}
