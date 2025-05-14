/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.semana_5_1gettersetter;

/**
 *
 * @author Personal
 */
public class Semana_5_1GetterSetter {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.MostrarDatos();

        Persona persona2 = new Persona("Joldy");
        persona2.MostrarDatos();

        Persona persona3 = new Persona("Daniel", 18, 11 , "danielTrava@gmail.com");
        persona3.MostrarDatos();
        
        Persona persona4 = new Persona();
            persona4.setNombre("Alejandro");
            persona4.setDni(22222222);
            persona4.setEdad(18);
            persona4.setCorreo("elmaspro@utpl.edu.ec");
            //System.out.println("Nombre: " + persona4.getNombre());
            //System.out.println("DNI: " + persona4.getDni());
            //System.out.println("Edad: " + persona4.getEdad());
            //System.out.println("Correo: " + persona4.getCorreo());
            System.out.println(persona4.toString());
    }
}
