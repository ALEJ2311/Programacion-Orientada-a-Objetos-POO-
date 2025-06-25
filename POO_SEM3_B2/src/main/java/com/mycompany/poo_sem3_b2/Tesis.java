/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Tesis extends Recurso{
    private String universidad;
    private String fechaInsercion;

    public Tesis(String universidad, String fechaInsercion, String autor, String titulo, String fechaPublicacion) {
        super(autor, titulo, fechaPublicacion);
        this.universidad = universidad;
        this.fechaInsercion = fechaInsercion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getFechaInsercion() {
        return fechaInsercion;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setFechaInsercion(String fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }

    @Override
    public String toString() {
        return "Tesis{" + "universidad=" + universidad + ", fechaInsercion=" + fechaInsercion + super.toString() + '}';
    }
    
    
}
