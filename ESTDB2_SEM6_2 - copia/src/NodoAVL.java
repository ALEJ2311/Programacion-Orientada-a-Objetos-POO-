


public class NodoAVL {
    int valor; // valor que es el ingresado
    int fe; // Factor de equilibrio
    NodoAVL izq, der; //Nodo izquierda y derecha

    public NodoAVL(int _valor) { //Constructor e inicialización
        this.valor = _valor;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }
}
