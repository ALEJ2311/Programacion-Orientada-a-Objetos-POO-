/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Cuadrado extends Figura{//hacemos herencia a la clase abstracta
    double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    double calcularArea() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return lado * lado;
    }

    @Override
    double calcularPrmtro() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return 4 * lado;
    }
    
}
