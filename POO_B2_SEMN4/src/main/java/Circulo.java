

class Circulo extends Figura{
    double radio;
    Circulo(double r){
        this.radio = r;
    }

    @Override
    double calcularArea() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPrmtro() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return 2 * Math.PI * radio;
    }
}
