/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

/**
 *
 * @author USUARIO
 */
public class Celular {
    private String marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    
    public Celular(){
        
    }
    
    public Celular(String marca, String modelo, int almacenamiento, int ram){
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
   public void setModelo(String modelo){
        this.modelo = modelo;
    }
   
   public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }
   
   public void setRam(int ram){
        this.ram = ram;
    }
   
   public String getMarca(){
       return marca;
   }
   
   public String getModelo(){
       return modelo;
   }
   
   public int getAlmacenamiento(){
       return almacenamiento;
   }
   
   public int getRam(){
       return ram;
   }
   
   public String getSistemaOperativo(){
       switch (marca.toLowerCase()) {
           case "samsung","xiaomi":              
               return "Android";
           case "apple":
               return "IOS";
           default:
               return "Inexistente";
       }
   }
}
