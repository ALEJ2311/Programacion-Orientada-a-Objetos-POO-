/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Grafica {
    
    private String nomGrafica;
    private int serieGr;
    private int nGigasG;
    public Grafica(){
        
    }
    
    public Grafica(String nomGrafica, int serieGr, int nGigasG){
        this.nomGrafica = nomGrafica;
        this.serieGr = serieGr;
        this.nGigasG = nGigasG;
    }

    public String getNomGrafica() {
        return nomGrafica;
    }

    public void setNomGrafica(String nomGrafica) {
        this.nomGrafica = nomGrafica;
    }

    public int getSerieGr() {
        return serieGr;
    }

    public void setSerieGr(int serieGr) {
        this.serieGr = serieGr;
    }

    public int getnGigasG() {
        return nGigasG;
    }

    public void setnGigasG(int nGigasG) {
        this.nGigasG = nGigasG;
    }
    
    public String getTProce(){
        switch(nomGrafica.toLowerCase()){
            case "nvidia", "rtx":
                return "Intel";
            case "ryzen":
                return "AMD";
            default:
                return "No encontrado";
        }
    }
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Grafica grafica = new Grafica();
        System.out.print("Ingrese el nombre de la grafica: ");
        grafica.setNomGrafica(tcl.nextLine());
        System.out.print("Ingrese la serie de la grafica: ");
        grafica.setSerieGr(tcl.nextInt());
        System.out.print("Ingrese el numero de gigas de la grafica: ");
        grafica.setnGigasG(tcl.nextInt());
        
        System.out.println("--DATOS GRAFICA---");
        System.out.println("Nombre: " + grafica.getNomGrafica());
        System.out.println("Serie: " + grafica.getSerieGr());
        System.out.println("Numero de Gigas: " + grafica.getnGigasG() + " GB");
        System.out.println("Procesador Suguerido: " + grafica.getTProce());
    }
}
