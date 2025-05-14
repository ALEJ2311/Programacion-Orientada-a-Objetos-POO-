/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_5_1gettersetter;

/**
 *
 * @author ALEJ2311_40HS
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String correo;
    
    //Constructor 1
    public Persona(){
        
    }
    
    //Constructor2
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Constructor3
    public Persona(String nombre1, int edad1, int dni1, String correo1){
        this.nombre = nombre1;
        this.dni = dni1;
        this.edad = edad1;
        this.correo = correo1;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad );
        System.out.println("DNI: " + dni );
        System.out.println("Correo: " + correo);
    }
    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
