/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana1_b2_poo;

/**
 *
 * @author Personal
 */
public class Perro extends Animal{
    String raza;
    
    
    
    public Perro(String tipo, int edad, String etapa, String raza) {
        super(tipo, edad, etapa);
        this.raza = raza;
        
    }
    
    public void ladrar(){
        System.out.println("Guau Guau - Soy un " + raza);
    }
    
    public void vacunas(){
        switch (etapa) {
            case "Cachorro":
                System.out.println("Necesita 4 vacunas;");
                break;
            case "Adulto":
                System.out.println("Necesita 7 vacunas");
                break;
        }
    }
    public void Pr(){
        System.out.println("Su perro es un: " + etapa);
        
    }
}
