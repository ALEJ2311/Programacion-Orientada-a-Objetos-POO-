
import java.util.Scanner;


public class Pregunta5 {
    static Scanner tcl = new Scanner(System.in);
    public static void main(String[] args) {
        int listnum [] = new int[5];
        for (int i = 0; i < listnum.length; i++) {
            System.out.println("Ingrese numero " + (i+1));
            listnum[i] = tcl.nextInt();
        }
        int numeros = numMayores10(listnum);
        System.out.println("Numeros mayores a 10: " + numeros );
       
    }
    
    public static int numMayores10(int listanum[]){
        int nume = 0;
        for (int i = 0; i < listanum.length; i++) {
            if(listanum[i] > 10){
                nume++;
            }
        }
        return nume;
    }
}
