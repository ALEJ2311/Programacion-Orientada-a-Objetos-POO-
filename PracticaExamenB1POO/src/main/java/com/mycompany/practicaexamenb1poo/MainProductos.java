/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainProductos {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de productos: ");
        int numP = tcl.nextInt();
        Producto[] producto = new Producto[numP];
        for (int i = 0; i < producto.length; i++) {
            producto[i] = new Producto();
            producto[i].llenarDatos();            
        }
        System.out.println("----PRODUCTOS----");
        for(Producto p : producto ){
            System.out.println(p);
        }
    }
    
    
}
