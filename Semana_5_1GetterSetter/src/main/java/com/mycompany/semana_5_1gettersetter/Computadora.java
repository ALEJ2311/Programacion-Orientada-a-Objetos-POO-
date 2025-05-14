/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_5_1gettersetter;

/**
 *
 * @author Personal
 */
public class Computadora {

    private int memoria;
    private int disco;
    private String procesador;
    private String marca;
    private String monitor;

    public Computadora() {

    }

    public Computadora(int memoria, int disco, String procesador, String marca, String monitor) {
        this.memoria = memoria;
        this.disco = disco;
        this.procesador = procesador;
        this.marca = marca;
        this.monitor = monitor;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getDisco() {
        return disco;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMarca() {
        return marca;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getSistema() {
        String sistem;
        switch (procesador.toLowerCase()) {
            case "intel", "amd":
                return "Windows";
            case "m1", "m2", "m3":
                return "IOS";
            default:
                return "Desconocido";
        }
    }
}
