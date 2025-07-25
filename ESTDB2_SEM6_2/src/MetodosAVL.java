

import java.util.Scanner;

public class MetodosAVL {

    Scanner entrada;
    NodoAVL raiz;
    boolean h;
    
    
    public MetodosAVL() { //Constructor que inicializa los datos
        this.entrada = new Scanner(System.in);
        this.raiz = null;
        this.h = true;
    }

    public int menu() { //Metodo que nos muestra el menu de nuestro programa
        System.out.println("Insertar [1]: ");
        System.out.println("Buscar [2]: ");
        System.out.println("Eliminar [3]: ");
        System.out.println("Mostrar [4]: ");
        System.out.println("Salir [0]: ");
        return entrada.nextInt();
    }

    public boolean nodoVacio(NodoAVL actual) { //Verifica si un nodo esta vacío
        return actual == null;
    }

    // Rotación simple a la izquierda (Izquierda-Izquierda)
    public NodoAVL rotacionII(NodoAVL actual, NodoAVL n1) {
        actual.izq = n1.der; // Se ajusta el hijo derecho de n1 como hijo izquierdo de actual
        n1.der = actual; // Se sube n1 y actual se vuelve su hijo derecho
        // Se actualiza el factor de equilibrio
        if (n1.fe == -1) {
            actual.fe = 0;
            n1.fe = 0;
        } else {
            actual.fe = -1;
            n1.fe = 1;
        }
        return n1; // Se devuelve el nuevo subárbol balanceado
    }

    // Rotación simple a la derecha (Derecha-Derecha)
    public NodoAVL rotacionDD(NodoAVL actual, NodoAVL n1) {
        actual.der = n1.izq; // Ajuste del subárbol izquierdo de n1
        n1.izq = actual; // n1 sube y actual se vuelve su hijo izquierdo
        if (n1.fe == 1) {
            actual.fe = 0;
            n1.fe = 0;
        } else {
            actual.fe = 1;
            n1.fe = -1;
        }
        return n1;
    }

    // Rotación doble Izquierda-Derecha
    public NodoAVL rotacionID(NodoAVL actual, NodoAVL n1) {
        NodoAVL n2 = n1.der; // Se toma el hijo derecho de n1
        actual.izq = n2.der; // Ajusta hijo derecho de n2 como hijo izquierdo de actual
        n2.der = actual; // actual pasa a ser hijo izquierdo de n2
        n1.der = n2.izq; // n1 ajusta hijo izquierdo de n2
        n2.izq = n1; // n1 pasa a ser hijo derecho de n2
        // Se actualizan los factores de equilibrio
        if (n2.fe == 1) {
            n1.fe = -1;
        } else {
            n1.fe = 0;
        }
        if (n2.fe == -1) {
            actual.fe = 1;
        } else {
            actual.fe = 0;
        }
        n2.fe = 0;
        return n2; // Devuelve el subárbol balanceado
    }

    // Rotación doble Derecha-Izquierda
    public NodoAVL rotacionDI(NodoAVL actual, NodoAVL n1) {
        NodoAVL n2 = n1.izq; // Se toma el hijo izquierdo de n1
        actual.der = n2.izq; // Ajuste del subárbol
        n2.izq = actual; // actual pasa a ser hijo izquierdo de n2
        n1.izq = n2.der; // Ajuste de hijo derecho de n2
        n2.der = n1; // n1 pasa a ser hijo derecho de n2
        // Se actualizan los factores de equilibrio
        if (n2.fe == -1) {
            n1.fe = 1;
        } else {
            n1.fe = 0;
        }
        if (n2.fe == 1) {
            actual.fe = -1;
        } else {
            actual.fe = 0;
        }
        n2.fe = 0;
        return n2; // Devuelve el subárbol balanceado
    }

    // Inserción AVL
    public NodoAVL insertarAVL(int num, NodoAVL actual) {
        if (nodoVacio(actual)) {
            NodoAVL nuevo = new NodoAVL(num); // Crea nuevo nodo
            h = true; // Se modificó la altura
            return nuevo;
        } else if (num < actual.valor) { // Insertar en izquierda
            actual.izq = insertarAVL(num, actual.izq);
            if (h) { // Si la altura cambió
                switch (actual.fe) {
                    case 1 -> { // Estaba balanceado, ahora queda balanceado
                        actual.fe = 0;
                        h = false;
                    }
                    case 0 -> { // Ahora se inclina a la izquierda
                        actual.fe = -1;
                    }
                    case -1 -> { // Desbalance: aplicar rotación
                        NodoAVL n1 = actual.izq;
                        if (n1.fe == -1) {
                            actual = rotacionII(actual, n1);
                        } else {
                            actual = rotacionID(actual, n1);
                        }
                        h = false;
                    }
                }
            }
        } else { // Insertar en derecha
            actual.der = insertarAVL(num, actual.der);
            if (h) {
                switch (actual.fe) {
                    case -1 -> {
                        actual.fe = 0;
                        h = false;
                    }
                    case 0 -> {
                        actual.fe = 1;
                    }
                    case 1 -> {
                        NodoAVL n1 = actual.der;
                        if (n1.fe == 1) {
                            actual = rotacionDD(actual, n1);
                        } else {
                            actual = rotacionDI(actual, n1);
                        }
                        h = false;
                    }
                }
            }
        }
        return actual;
    }

    // Búsqueda de nodo
    public void buscar(NodoAVL actual, int num, int cont) {
        if (nodoVacio(actual)) {
            System.out.println("Elemento no encontrado...");
        } else if (num < actual.valor) {
            buscar(actual.izq, num, ++cont);
        } else if (num > actual.valor) {
            buscar(actual.der, num, ++cont);
        } else {
            System.out.println("Nodo encontrado en " + cont + " pasos");
        }
    }

    // Encuentra el nodo con el valor más pequeño
    private NodoAVL buscarMin(NodoAVL actual) {
        while (actual.izq != null) {
            actual = actual.izq;
        }
        return actual;
    }

    // Método eliminar AVL
    public NodoAVL eliminar(int num, NodoAVL actual) {
        if (actual == null) {
            System.out.println("Nodo no encontrado");
            h = false;
            return null;
        }

        if (num < actual.valor) { // Buscar en la izquierda
            actual.izq = eliminar(num, actual.izq);
            if (h) {
                actual = balancearDer(actual);  // Rebalancear hacia la derecha
            }
        } else if (num > actual.valor) {
            actual.der = eliminar(num, actual.der);
            if (h) {
                actual = balancearIzq(actual); // Rebalancear hacia la izquierda
            }
        } else {
            // Nodo encontrado
            if (actual.izq == null || actual.der == null) {
                actual = (actual.izq != null) ? actual.izq : actual.der;
                h = true; // La altura cambió
            } else { // Tiene dos hijos
                NodoAVL sucesor = buscarMin(actual.der); // Buscamos el menor del subárbol derecho
                actual.valor = sucesor.valor; // Reemplazamos el valor
                actual.der = eliminar(sucesor.valor, actual.der); // Eliminamos el sucesor
                if (h) {
                    actual = balancearIzq(actual); // Balancear si es necesario
                }
            }
        }
        return actual;
    }

    // Balanceo hacia la derecha después de eliminar
    private NodoAVL balancearDer(NodoAVL actual) {
        switch (actual.fe) {
            case -1 -> { // Se balancea
                actual.fe = 0;
            }
            case 0 -> { // Se desequilibra un poco pero aún es tolerable
                actual.fe = 1;
                h = false;
            }
            case 1 -> {
                NodoAVL n1 = actual.der;
                if (n1.fe >= 0) {
                    actual = rotacionDD(actual, n1);
                    if (n1.fe == 0) {
                        actual.fe = -1;
                        h = false;
                    }
                } else {
                    actual = rotacionDI(actual, n1);
                }
            }
        }
        return actual;
    }

    // Balanceo hacia la izquierda después de eliminar
    private NodoAVL balancearIzq(NodoAVL actual) {
        switch (actual.fe) {
            case 1 -> {
                actual.fe = 0;
            }
            case 0 -> {
                actual.fe = -1;
                h = false;
            }
            case -1 -> {
                NodoAVL n1 = actual.izq;
                if (n1.fe <= 0) {
                    actual = rotacionII(actual, n1);
                    if (n1.fe == 0) {
                        actual.fe = 1;
                        h = false;
                    }
                } else {
                    actual = rotacionID(actual, n1);
                }
            }
        }
        return actual;
    }
    
    public void mostrarArbol(NodoAVL nodo, int nivel) {
    if (nodo != null) {
        mostrarArbol(nodo.der, nivel + 1); // Mostrar lado derecho primero (más profundo)
        
        // Imprime espacios según el nivel para alinear
        for (int i = 0; i < nivel; i++) {
            System.out.print("   ");
        }

        // Imprime el valor del nodo en formato solicitado
        System.out.println(nodo.valor + "[]");

        mostrarArbol(nodo.izq, nivel + 1); // Luego mostrar lado izquierdo
    }
}
}
