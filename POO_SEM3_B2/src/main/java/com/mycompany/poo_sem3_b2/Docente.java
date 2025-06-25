/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Docente extends Persona{
    private int horasClase;

    public Docente(int horasClase, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.horasClase = horasClase;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    @Override
    public String toString() {
        return "Docente{" + "horasClase=" + horasClase + super.toString() + '}';
    }
    
    
}
