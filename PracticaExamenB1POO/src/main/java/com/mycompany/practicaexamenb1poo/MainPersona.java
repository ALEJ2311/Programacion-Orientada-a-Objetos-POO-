/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaexamenb1poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MainPersona {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Persona persona = new Persona();
        persona.llenarDatos();
        
        FileOutputStream fileOutputStream = new FileOutputStream("persona.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona);
        
        FileInputStream fileInputStream = new FileInputStream("persona.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Persona personaPr = (Persona) objectInputStream.readObject();
        objectInputStream.close();
        personaPr.verificarCedula();
        System.out.println(personaPr.toString());
        //persona.verificarCedula();
        
    }
}
