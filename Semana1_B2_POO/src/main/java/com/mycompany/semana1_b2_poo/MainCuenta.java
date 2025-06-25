/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana1_b2_poo;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MainCuenta {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("---SISTEMA BANCARIO---");
        System.out.println("1. Cuenta de Ahrros");
        System.out.println("2. Cuenta Corriente");
        System.out.println("Ingrese una opcion: ");
        int opcion = tcl.nextInt();
        tcl.nextLine();
        switch (opcion) {
            case 1:
                ingresoCtaA();
                break;
            case 2:
                ingresoCtaC();
                break;
            default:
                System.out.println("Opcion Inexistente");
        }
    }

    public static void ingresoCtaA() {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese nombre del titular: ");
        String titularA = tcl.nextLine();
        System.out.println("Ingrese su saldo: ");
        int saldoA = tcl.nextInt();
        CtaAhorros ctA = new CtaAhorros(titularA, saldoA);
        ctA.interesT();
    }

    public static void ingresoCtaC() {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese nombre del titular: ");
        String titularC = tcl.nextLine();
        System.out.println("Ingrese su saldo: ");
        int saldoC = tcl.nextInt();
        CtaCorriente ctaC = new CtaCorriente(saldoC, titularC);
        ctaC.interesT();
    }
}
