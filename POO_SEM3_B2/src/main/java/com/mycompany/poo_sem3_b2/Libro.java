/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Libro extends Recurso{
    private int isbn;
    private int numImpresiones;

    public Libro(int isbn, int numImpresiones, String autor, String titulo, String fechaPublicacion) {
        super(autor, titulo, fechaPublicacion);
        this.isbn = isbn;
        this.numImpresiones = numImpresiones;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getNumImpresiones() {
        return numImpresiones;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNumImpresiones(int numImpresiones) {
        this.numImpresiones = numImpresiones;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", numImpresiones=" + numImpresiones + super.toString() + '}';
    }
    
    
}
