
import java.util.Scanner;

public class Pregunta1 {

    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese una palabra: ");
        String palabra = tcl.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            switch (letra) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
                default:

            }
        }
        System.out.println("La palabra tiene : " + contador +  " vocales");
        
    }
}
