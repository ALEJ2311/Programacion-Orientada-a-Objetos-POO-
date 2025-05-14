/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

/**
 *
 * @author USUARIO
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numPag;
    private int anoPubli;
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor, int numPag, int anoPubli){
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.anoPubli = anoPubli;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setNumPag(int numPag){
        this.numPag = numPag;
    }
    
    public void setAnoPubli(int anoPubli){
        this.anoPubli = anoPubli;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNumPag(){
        return numPag;
    }
    
    public int getAnoPubli(){
        return anoPubli;
    }
    
    public boolean esAntiguo(){
        if(anoPubli < 2000){
            return true;
        }else{
            return false;
        }
        //OTRA MEJOR FORMA DE HACERLO
        //return anoPubli < 2000;
    }
}
