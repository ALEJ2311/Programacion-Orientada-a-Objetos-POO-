/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana1_b2_poo;



/**
 *
 * @author Personal
 */
public class Animal {

    String tipo;
    int edad;
    String etapa;

    public Animal(String tipo, int edad, String etapa) {
        this.tipo = tipo;
        this.edad = edad;
        vida();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        vida();
    }
    
    public void describir() {
        System.out.println("Tipo: " + tipo);
    }

    public void vida() {
        if (edad >= 0 && edad <= 3) {
            etapa = "Cachorro";
        } else {
            etapa = "Adulto";
        }
    }
}
