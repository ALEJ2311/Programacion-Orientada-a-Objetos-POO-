
import java.util.Scanner;

public class Pregunta2 {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una frase:");
        String frase = tcl.nextLine();
        String invert = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            invert += frase.charAt(i);
        }
        System.out.println(invert);
    }
}
