/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

/**
 *
 * @author USUARIO
 */
public class Auto {

    private String marca;
    private String modelo;
    private int velociMax;
    private String tipMotor;

    public Auto() {

    }

    public Auto(String marca, String modelo, int velociMax, String tipMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velociMax = velociMax;
        this.tipMotor = tipMotor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelociMax(int velociMax) {
        this.velociMax = velociMax;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getVelociMax(){
        return velociMax;
    }
    
    public String getTipMotor(){
        return tipMotor;
    }
    
    public String recomendacionCombustible(){
        switch(tipMotor.toLowerCase()){
            case "electrico":
                return "electricidad";
            case "gasolina" , "diesel":
                return "combustible fosil";
            default:
                return "INEXISTENTE";
        }
    }
}
