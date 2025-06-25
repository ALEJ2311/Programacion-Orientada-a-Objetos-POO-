/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Recurso {
    private String autor;
    private String titulo;
    private String fechaPublicacion;

    public Recurso(String autor, String titulo, String fechaPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Recurso{" + "autor=" + autor + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + '}';
    }
    
    
}
