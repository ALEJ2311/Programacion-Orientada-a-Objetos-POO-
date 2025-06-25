/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana1_b2_poo;

/**
 *
 * @author Personal
 */
public class CtaCorriente extends Cuenta{
    double saldo;
    double interes = 0.07;

    public CtaCorriente(double saldo, String titular) {
        super(titular);
        this.saldo = saldo;
    }
    
    public void mostrarSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
    
    public void interesT(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Su ganancia con " + saldo + " y un interes del 5% es de: " + (saldo* interes) + "$");
    }    
}
