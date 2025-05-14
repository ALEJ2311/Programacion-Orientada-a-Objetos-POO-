/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_5_1gettersetter;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PresentarCompu {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora();
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingrese la memoria en GB de su computador: ");
        computadora1.setDisco(tcl.nextInt());
        System.out.println("Ingrese el espaacio de su disco en GB: ");
        computadora1.setDisco(tcl.nextInt());
        tcl.nextLine();
        System.out.println("Ingrese el nombre de su procesador: ");
        computadora1.setProcesador(tcl.nextLine());
        
        System.out.println("Ingrese la marca de su computadora");
        computadora1.setMarca(tcl.next());
        
        System.out.println("Ingrese el nombre de su monitor: ");
        computadora1.setMonitor(tcl.next());
        
        System.out.println("CARACTERISTICAS DE SU COMPUTADORA");
        System.out.println("Memoria: " + computadora1.getMemoria() + "GB");
        System.out.println("Disco: " + computadora1.getDisco() + "GB");
        System.out.println("Procesador: " + computadora1.getProcesador());
        
        System.out.println("Marca: " + computadora1.getMarca());
        System.out.println("Monitor: " + computadora1.getMonitor());
    }
}
