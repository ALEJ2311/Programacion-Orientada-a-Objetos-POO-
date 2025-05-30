/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainEstudiantes {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Ingrese el numero de materias: ");
        int limite = tcl.nextInt();
        Estudiantes estudiante = new Estudiantes();
        estudiante.llenarDatos(limite);
        
        FileOutputStream fileOutputStream = new FileOutputStream("estudiantes.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(estudiante);
        objectOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream("estudiantes.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Estudiantes estudiante2 = (Estudiantes) objectInputStream.readObject();
        
        estudiante2.verificarCedula();
        System.out.println(estudiante2.toString());
        
    }
}
