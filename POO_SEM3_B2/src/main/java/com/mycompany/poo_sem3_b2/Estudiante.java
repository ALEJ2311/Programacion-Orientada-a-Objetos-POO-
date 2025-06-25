/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Estudiante extends Persona{
    private int expediente;

    public Estudiante(int expediente, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.expediente = expediente;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "expediente=" + expediente + super.toString() + '}';
    }
    
    
}
