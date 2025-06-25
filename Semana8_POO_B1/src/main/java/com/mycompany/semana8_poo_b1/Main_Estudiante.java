/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8_poo_b1;

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.Scanner;
public class Main_Estudiante {
   

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Estudiante estudiante = new Estudiante();
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        estudiante.setNombre(tcl.nextLine());
        System.out.println("Ingrese el ciclo en el que se encuentra");
        estudiante.setCiclo(tcl.nextInt());
        tcl.nextLine();
        System.out.println("Ingrese su numero de Materias:");
        int limite = tcl.nextInt();
        tcl.nextLine();
        estudiante.llenarMaterias(limite);
        estudiante.llenarNotas(limite);

        FileOutputStream fileOutputStream = new FileOutputStream("estudiante.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(estudiante);
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("estudiante.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Estudiante estudiante2 = (Estudiante) objectInputStream.readObject();

        objectInputStream.close();
        //System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());


    }
}

