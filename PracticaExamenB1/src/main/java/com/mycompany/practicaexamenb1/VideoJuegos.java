/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

/**
 *
 * @author USUARIO
 */
public class VideoJuegos {
    private String nombre;
    private String genero;
    private String plataforma;
    private double precio;
    
    public VideoJuegos(){
        
    }
    
    public VideoJuegos(String nombre, String genero, String plataforma, double precio){
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getNombre(){
        return  nombre;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public String getPlataforma(){
        return plataforma;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public boolean esMultijugador(){
        switch(genero.toLowerCase()){
            case "accion","deportes":
                return true;
            default:
                return false;
        }
    }
}
