/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Personal
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplo de polimorfismo: ");
        //Creamos las subclases por medio de la clase padre
        //Por eso no podemos ingresar de manera convencional a sus atributos
        Persona estudiante1 = new Estudiante(12, "Carlos", "Jaramillo", 23);
        Persona estudiante2 = new Estudiante(13, "Maria", "Carrión", 54);
        
        Persona docente1 = new Docente(22, "Ramiro", "Ramirez", 67);
        Persona docente2 = new Docente(23, "Daniel", "Guaman", 81);
        
        Persona administrativo1 = new Administrativo(2, "Patricio", "Rivas", 43);
        Persona administrativo2 = new Administrativo(3, "Pedro", "Pe", 90);
        
        
        List<Persona> lista = new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(docente1);
        lista.add(docente2);
        lista.add(administrativo1);
        lista.add(administrativo2);
        //administrativo1.setNombre("Pato");
        
        ((Docente)docente2).setHorasClase(10); //Manera para ingresar a los atributos de las clases hijas
        ((Administrativo)administrativo1).setUniformes(5);
        ((Administrativo)administrativo1).setUniformes(4);
        for(Persona p: lista){
            System.out.println(p.toString());
        }
    }
}
