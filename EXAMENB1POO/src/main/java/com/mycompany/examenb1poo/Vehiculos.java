/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenb1poo;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Vehiculos {
    private String marca;
    private String modelo;
    private String placa;
    private double[] metrosAcele;
    private double[] velociMetrosAcele;
    private double[] tiempoVelocixT;
    
    public Vehiculos(){
        
    }

    public Vehiculos(String marca, String modelo, String placa, double[] metrosAcele, double[] velociMetrosAcele, double[] tiempoVelocixT) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.metrosAcele = metrosAcele;
        this.velociMetrosAcele = velociMetrosAcele;
        this.tiempoVelocixT = tiempoVelocixT;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double[] getMetrosAcele() {
        return metrosAcele;
    }

    public void setMetrosAcele(double[] metros) {
        this.metrosAcele = metros;
    }

    public double[] getVelociMetrosAcele() {
        return velociMetrosAcele;
    }

    public void setVelociMetrosAcele(double[] velocidad) {
        this.velociMetrosAcele = velocidad;
    }

    public double[] getTiempoVelocixT() {
        return tiempoVelocixT;
    }

    public void setTiempoVelocixT(double[] tiempo) {
        this.tiempoVelocixT = tiempo;
    }
    
    public void llenarDatos(){
        Scanner tcl = new Scanner(System.in);
        int datos = 4;
        double[] metros = new double[datos];
        double[] velocidad = new double[datos];
        double[] tiempo = new double[datos];
        System.out.println("Ingrese la marca del vehiculo: ");
        this.marca = tcl.nextLine();
        System.out.println("Ingrese el modelo del vehiculo: ");
        this.modelo = tcl.nextLine();
        System.out.println("Ingrese la placa del vehiculo: ");
        this.placa = tcl.nextLine();
        for (int i = 0; i < metros.length; i++) {
            System.out.println("Ingrese Datos nro." + (i+1));
            System.out.println("Ingrese el tiempo (segundos): ");
            tiempo[i] = tcl.nextDouble();
            System.out.println("Ingrese los metros: ");
            metros[i] = tcl.nextDouble();
            System.out.println("Ingrese la velocidad: ");
            velocidad[i] = tcl.nextDouble();
        }
        this.setTiempoVelocixT(tiempo);
        this.setMetrosAcele(metros);
        this.setVelociMetrosAcele(velocidad);
        this.promTiempo(tiempo);
        this.promMetros(metros);
    }
    
    public double promTiempo(double[] tiempo){
       double sum = 0;
        for (int i = 0; i < tiempo.length; i++) {
            sum += tiempo[i];
        }
        return sum / tiempo.length;
    }
    
    public double promMetros(double[] metros){
        double sumM = 0;
        for (int i = 0; i < metros.length; i++) {
            sumM += metros[i];
        }
        return sumM / metros.length;
    }
    public String mesMatriculacion(){
        String aux = this.getPlaca();
        int ultimoDigi = Character.getNumericValue(aux.charAt(aux.length()-1));
        switch (ultimoDigi) {
            case 1:
                  return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Octubre";
            case 0:
                return "Noviembre";
            default:
                throw new AssertionError();
        }
        
    }
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Promedio en tiempo a llegar a 100km/h " + promTiempo(tiempoVelocixT) + "s");
        System.out.println("Promedio en metros a llegar a 100km/h " + promMetros(metrosAcele) + "m");
        System.out.println("Mes en el que debe Matricular el Vehiculo " + mesMatriculacion() );
    }
}
