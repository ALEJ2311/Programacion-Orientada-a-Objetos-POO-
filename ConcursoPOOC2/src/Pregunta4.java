
import java.util.Scanner;


public class Pregunta4 {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un numero limite: ");
        int num = tcl.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + ",");
            
        }
    }
   
}
