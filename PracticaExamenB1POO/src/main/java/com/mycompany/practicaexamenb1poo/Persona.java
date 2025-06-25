/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Persona implements Serializable {

    private String nombre;
    private int edad;
    private String correo;
    private String cedula;

    public Persona() {

    }

    public Persona(String nombre, int edad, String correo, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void llenarDatos() {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        this.nombre = tcl.nextLine();
        System.out.println("Ingrese su edad: ");
        this.edad = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Ingrese su correo: ");
        this.correo = tcl.nextLine();
        System.out.println("Ingrese su cedula (10 digitos)");
        this.cedula = tcl.nextLine();
    }

    public void verificarCedula() {
        int bandera = 2;
        int sum = 0;
        int num = 0;
        int[] numeros = new int[cedula.length()];
        for (int i = 0; i < cedula.length(); i++) {
            numeros[i] = Character.getNumericValue(cedula.charAt(i));
        }
        for (int i = 0; i < 9; i++) {
            if (bandera == 2) {
                num = numeros[i] * 2;
                if (num >= 10) {
                    num -= 9;
                }
                bandera = 1;
            } else {
                if (bandera == 1) {
                    num = numeros[i] * 1;
                    bandera = 2;
                }
            }
            sum += num;
        }
        int residuo = sum % 10;
        int digitoVerificador = (residuo == 0) ? 0 : 10 - residuo;
        System.out.println("Dígito verificador calculado: " + digitoVerificador);
        System.out.println("Dígito verificador real (último dígito): " + numeros[9]);
        if (digitoVerificador == numeros[9]) {
            System.out.println("Cedula valida");
        } else {
            System.out.println("Cedula Invalida");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", cedula=" + cedula + '}';
    }
    
    
}
