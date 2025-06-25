/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_sem3_b2;

/**
 *
 * @author Personal
 */
public class Revista extends Recurso{
    private int numEdicion;
    private String urlRevista;

    public Revista(int numEdicion, String urlRevista, String autor, String titulo, String fechaPublicacion) {
        super(autor, titulo, fechaPublicacion);
        this.numEdicion = numEdicion;
        this.urlRevista = urlRevista;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public String getUrlRevista() {
        return urlRevista;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public void setUrlRevista(String urlRevista) {
        this.urlRevista = urlRevista;
    }

    @Override
    public String toString() {
        return "Revista{" + "numEdicion=" + numEdicion + ", urlRevista=" + urlRevista + super.toString() + '}';
    }
    
    
}
