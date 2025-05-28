/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana8_poo_b1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;

/**
 *
 * @author Personal
 */
public class Archivo {
    public static void main(String[] args) throws FileAlreadyExistsException, IOException, ClassNotFoundException{
        Persona persona = new Persona();
        persona.setNombre("Juan Carrion");
        persona.setDni(121212);
        persona.setEdad(32);
        persona.setCorreo("jcarrion@gmail.com");
        
        //creamos el objeto para guardarlo en el archivo serializado
        FileOutputStream fileOutputStream = new FileOutputStream("persona.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona) ;
        objectOutputStream.close();
        
        //leemos el objeto del archivo serializado
        FileInputStream fileInputStream = new FileInputStream("persona.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
        Persona persona2 = (Persona) objectInputStream.readObject();
        objectInputStream.close();
        
        //System.out.println(persona);
        System.out.println(persona2);
    }
    
}
