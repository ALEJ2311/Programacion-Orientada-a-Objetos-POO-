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

public class IngresoDatosLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro: ");
        libro.setTitulo(tcl.nextLine());
        System.out.println("Ingrese el autor del libro: ");
        libro.setAutor(tcl.nextLine());
        System.out.println("Ingrese el numero de paginas: ");
        libro.setNumPag(tcl.nextInt());
        System.out.println("Ingrese el año de publicacion: ");
        libro.setAnoPubli(tcl.nextInt());
        
        if(libro.esAntiguo()){
            System.out.println("El libro es Antiguo");
        }else{
            System.out.println("El libro no es Antiguo");
        }
    }
}
