/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Rombo extends Figura {

    double diagonalMayor, diagonalMenor, lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    double calcularArea() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    double calcularPrmtro() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return 4 * lado;
    }

}
