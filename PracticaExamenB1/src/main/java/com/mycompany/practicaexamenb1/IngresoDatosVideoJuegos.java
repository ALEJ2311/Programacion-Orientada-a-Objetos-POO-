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
public class IngresoDatosVideoJuegos {
    public static void main(String[] args) {
        VideoJuegos videoJuegos = new VideoJuegos();
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        videoJuegos.setNombre(tcl.nextLine());
        System.out.println("Ingrese el genero: ");
        videoJuegos.setGenero(tcl.nextLine());
        System.out.println("Ingrese su plataforma: ");
        videoJuegos.setPlataforma(tcl.nextLine());
        System.out.println("Ingrese el precio: ");
        videoJuegos.setPrecio(tcl.nextDouble());
        
        System.out.println("----DATOS----");
        System.out.println("Nombre: " + videoJuegos.getNombre());
        System.out.println("Genero: " + videoJuegos.getGenero());
        System.out.println("Plataforma: " + videoJuegos.getPlataforma());
        System.out.println("Es multijugador?: " + (videoJuegos.esMultijugador() ? "Si":"No"));
        System.out.println("Precio: " + videoJuegos.getPrecio());
    }
}
