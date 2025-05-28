package com.mycompany.semana_6_b1;
import java.util.Scanner;
/**
 * @author ALEJ2311#1834 en Valorant :D
 */
public class Arreglos {

    public static void main(String[] args) {
        //Arreglo de tamaño [9]
        //String provincias[] = {"Pichincha", "Loja", "Azuay", "Cañar", "Bolivar", "Guayas", "Los Rios", "Manabi", "Esmeraldas"};
        //for (int i = 0; i < provincias.length; i++) { //Forma tradicional de imprimir un arreglo
        //System.out.println(provincias[i]);
        //}
        //for(String provincia : provincias){ //Otra forma de usar el for para imprimir 
        //System.out.println("Provincia de: " + provincia);
        //}
        Scanner tcl = new Scanner(System.in);
        double calificaciones[] = new double[10];
        double sum = 0;
        String nombre;

        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = tcl.nextLine();

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese calficacion de materia " + (i + 1) + ": ");
            calificaciones[i] = tcl.nextDouble();
            sum += calificaciones[i];
        }

        double prom = sum / calificaciones.length;

        System.out.println("--Libreta de Calificaciones--");
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificaciones: ");

        for (double califi : calificaciones) {
            System.out.println("- " + califi);
        }

        System.out.println("Promedio de calficaciones: " + prom);
        System.out.print("Promedio Cualitativo: ");

        if (prom >= 0 && prom <= 3.09) {
            System.out.print("Regular");
        } else {
            if (prom >= 3.1 && prom <= 5.09) {
                System.out.print("Insuficiente");
            } else {
                if (prom >= 5.1 && prom <= 7.09) {
                    System.out.print("Bueno");
                } else {
                    if (prom >= 7.1 && prom <= 9.09) {
                        System.out.print("Muy Bueno");
                    } else {
                        if (prom >= 9.1 && prom <= 10) {
                            System.out.print("Sobresaliente");
                        }
                    }
                }
            }
        }

    }
}
