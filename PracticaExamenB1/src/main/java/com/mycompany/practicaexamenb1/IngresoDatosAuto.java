/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class IngresoDatosAuto {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese la marca: ");
        auto.setMarca(tcl.nextLine());
        System.out.println("Ingrese el modelo: ");
        auto.setModelo(tcl.nextLine());
        System.out.println("Ingrese su velocidad maxima: ");
        auto.setVelociMax(tcl.nextInt());
        tcl.nextLine();
        System.out.println("Ingrese el tipo de motor: ");
        auto.setTipMotor(tcl.nextLine());
        
        System.out.println("----DATOS DE AUTO---");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Velocidad Maxima: " + auto.getVelociMax());
        System.out.println("Tipo de motor: " + auto.getTipMotor());
        System.out.println("Recargar auto con " + auto.recomendacionCombustible());
    }
}
