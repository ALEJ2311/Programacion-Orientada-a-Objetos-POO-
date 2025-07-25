
public class ArbolAVL {

    public static void main(String[] args) {
        int op, num;
        MetodosAVL myArbol = new MetodosAVL(); // Creamos el arbol con los metodos AVL

        do {
            op = myArbol.menu(); // Mostramos el menú
            switch (op) {
                case 1 -> {
                    System.out.print("Valor a insertar: "); //Insertamos el dato(int)
                    num = myArbol.entrada.nextInt(); //leemos el dato ingresado
                    myArbol.raiz = myArbol.insertarAVL(num, myArbol.raiz); //Metodo para insertar datos(int)
                }
                case 2 -> {
                    System.out.print("Valor a buscar: "); //Insertamos el dato(int)
                    num = myArbol.entrada.nextInt(); //leemos el dato ingresado
                    myArbol.buscar(myArbol.raiz, num, 0); // Metodo de busqueda del dato solicitado
                }

                case 3 -> {
                    System.out.print("Valor a eliminar: "); //Insertamos el dato(int)
                    num = myArbol.entrada.nextInt(); //leemos el dato ingresado
                    myArbol.raiz = myArbol.eliminar(num, myArbol.raiz); // Metodo para elimación del dato solicitado
                }

                case 4 -> {
                    System.out.println("Árbol AVL:");
                    myArbol.mostrarArbol(myArbol.raiz, 0);
                }

                default -> {
                    System.out.println("ERROR");
                }
            }
        } while (op != 0); // Condicion que nos indica en que momento concluye el bucle
    }
}
