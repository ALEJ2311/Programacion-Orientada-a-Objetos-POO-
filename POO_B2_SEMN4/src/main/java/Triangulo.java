/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Triangulo extends Figura{
    double base, altura, lado1, lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return (base * altura) / 2;
    }

    @Override
    double calcularPrmtro() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return base + lado1 + lado2;
    }   
}
