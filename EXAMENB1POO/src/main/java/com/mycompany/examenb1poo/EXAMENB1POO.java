/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examenb1poo;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class EXAMENB1POO {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Cuantos vehiculos desea ingresar: ");
        int lim = tcl.nextInt();
        Vehiculos[] vehiculo = new Vehiculos[lim];

        for (int i = 0; i < vehiculo.length; i++) {
            vehiculo[i] = new Vehiculos();
            System.out.println("----Vehiculo " + (i + 1) + "----");
            vehiculo[i].llenarDatos();
            System.out.println("-----------------------------------------");

        }

        for (int i = 0; i < vehiculo.length; i++) {
            System.out.println("Datos Vehiculo " + (i + 1));
            vehiculo[i].mostrarDatos();
            System.out.println("-----------------------------------------");
        }
    }
}
