
public class Rectangulo extends Figura{
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return base * altura;
    }

    @Override
    double calcularPrmtro() {//hacemos override o sobrescribimos el metodo de la clase
                           //abstracta heredada
        return 2 * (base + altura);
    }
    
    
}
