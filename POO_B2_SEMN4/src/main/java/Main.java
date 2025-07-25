
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Main {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            
        }
        Figura[] figuras = { //Polimorfismo y creacion de arreglo de objetos
            new Circulo(5),
            new Cuadrado(4),
            new Rectangulo(6, 3),
            new Triangulo(5, 4, 3, 4),
            new Rombo(6, 4, 5)
        };

        for (Figura f : figuras) {
            System.out.printf("Area: %.2f | Perimetro: %.2f\n",
                    f.calcularArea(),
                    f.calcularPrmtro());
        }

    }
}