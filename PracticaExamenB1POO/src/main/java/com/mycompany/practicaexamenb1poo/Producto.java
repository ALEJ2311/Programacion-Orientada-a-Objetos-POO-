/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Producto implements Serializable {

    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
    private double[] calificaciones;
    private double promedioCalificaciones;
    private int numCalificacionesPositivas;
    private int numCalificacionesNegativas;
    public transient Scanner tcl = new Scanner(System.in);

    public Producto() {

    }

    public Producto(String nombre, double precio, int stock, String categoria, double[] calificaciones, double promedioCalificaciones, int numCalificacionesPositivas, int numCalificacionesNegativas) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.calificaciones = calificaciones;
        this.promedioCalificaciones = promedioCalificaciones;
        this.numCalificacionesPositivas = numCalificacionesPositivas;
        this.numCalificacionesNegativas = numCalificacionesNegativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] califi) {
        this.calificaciones = califi;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public void setPromedioCalificaciones(double[] califi) {
        double sum = 0;
        for (int i = 0; i < califi.length; i++) {
            sum += califi[i];
        }
        this.promedioCalificaciones = sum / califi.length;
    }

    public int getNumCalificacionesPositivas() {
        return numCalificacionesPositivas;
    }

    public void setNumCalificacionesPositivas(double[] califi) {
        int contador = 0;
        for (int i = 0; i < califi.length; i++) {
            if (califi[i] >= 7) {
                contador++;
            }
        }
        this.numCalificacionesPositivas = contador;
    }

    public int getNumCalificacionesNegativas() {
        return numCalificacionesNegativas;
    }

    public void setNumCalificacionesNegativas(double[] califi) {
        int nega = 0;
        for (int i = 0; i < califi.length; i++) {
            if (califi[i] < 7) {
                nega++;
            }
        }
        this.numCalificacionesNegativas = nega;
    }

    public void llenarDatos() {
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = tcl.nextLine();
        System.out.println("Ingrese su precio: ");
        this.precio = tcl.nextDouble();
        System.out.println("Ingrese el stock del producto:");
        this.stock = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Ingrese la categoría del producto: ");
        this.categoria = tcl.nextLine();
        double[] califi = new double[3];
        for (int i = 0; i < califi.length; i++) {
            System.out.println("Ingrese Calificacion" + (i + 1));
            califi[i] = tcl.nextInt();
        }
        this.setCalificaciones(califi);
        this.setPromedioCalificaciones(califi);
        this.setNumCalificacionesPositivas(califi);
        this.setNumCalificacionesNegativas(califi);
    }

    @Override
    public String toString() {
        return "Producto{"
                + "nombre='" + nombre + '\''
                + ", precio=" + precio
                + ", stock=" + stock
                + ", categoria='" + categoria + '\''
                + ", calificaciones=" + Arrays.toString(calificaciones)
                + ", promedioCalificaciones=" + promedioCalificaciones
                + ", numCalificacionesPositivas=" + numCalificacionesPositivas
                + ", numCalificacionesNegativas=" + numCalificacionesNegativas
                + '}';
    }

}
