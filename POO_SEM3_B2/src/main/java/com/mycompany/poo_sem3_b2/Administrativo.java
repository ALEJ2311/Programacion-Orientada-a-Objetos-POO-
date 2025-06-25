/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Administrativo extends Persona{

    private int uniformes;

    public Administrativo(int uniformes, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.uniformes = uniformes;
    }
    

    public int getUniformes() {
        return uniformes;
    }

    public void setUniformes(int uniformes) {
        this.uniformes = uniformes;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "uniformes=" + uniformes + super.toString() +'}';
    }

    
}
