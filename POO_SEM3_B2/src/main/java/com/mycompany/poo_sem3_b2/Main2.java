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
public class Main2 {
    public static void main(String[] args) {
        
        System.out.println("TAREA EN CLASE DE POLIMORFISMO: ");
        
        Recurso libro1 = new Libro(23, 100, "Benito T", "La Isla Misteriosa", "23/08/1678");
        Recurso libro2 = new Libro(67, 15, "Patricio R", "La vida en la socidad moderna", "12/09/2024");
        
        Recurso revista1 = new Revista(1, "https//revista2025.com", "Luis S", "Las Goticas", "18/06/2025");
        Recurso revista2 = new Revista(4, "https//valorantLA", "Daniel M", "Importancia del Mental", "10/11/2022");
        
        Recurso tesis1 = new Tesis("UTPL", "12/12/2012", "Jesus R", "Machine Learning para la vida", "23/08/2006");
        Recurso tesis2 = new Tesis("UESS", "10/04/2017", "Pedro pe", "Acuarismo y sus maravillas", "12/12/2012");
        
        List<Recurso> lista = new ArrayList<>();
        lista.add(libro1);
        lista.add(libro2);
        lista.add(revista1);
        lista.add(revista2);
        lista.add(tesis1);
        lista.add(tesis2);
        
        for(Recurso c: lista){
            System.out.println(c.toString());
        }
    }
}
