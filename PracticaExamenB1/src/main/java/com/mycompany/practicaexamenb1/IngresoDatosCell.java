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
public class IngresoDatosCell {
    public static void main(String[] args) {
        Celular celular = new Celular();
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese la marca de su celular:");
        celular.setMarca(tcl.nextLine());
        System.out.println("Ingrese el modelo de su celular: ");
        celular.setModelo(tcl.nextLine());
        System.out.println("Ingrese el almacenamiento: ");
        celular.setAlmacenamiento(tcl.nextInt());
        System.out.println("Ingrese la ram: ");
        celular.setRam(tcl.nextInt());
        
        
        System.out.println("ESPECIFICACIONES DE SU CELULAR");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Sistema Operativo: " + celular.getSistemaOperativo());
        System.out.println("Almacenamiento: " + celular.getAlmacenamiento());
        System.out.println("Ram: " + celular.getRam());
    }
    
    
}
