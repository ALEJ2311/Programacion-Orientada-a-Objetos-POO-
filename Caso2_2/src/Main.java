import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite = 2;
        for (int i = 0; i < limite; i++) {
            System.out.println("Usted es un usuario Primera Clase? (S/N)");
            String opcion = tcl.nextLine();
            if(opcion.equalsIgnoreCase("S")) {
                System.out.println("Ingrese su nombre: ");
                String nombre = tcl.nextLine();
                System.out.println("Ingrese su correo: ");
                String correo = tcl.nextLine();
                PrimeraClase usuarioPrimeraClase = new PrimeraClase(nombre, correo,2);
                System.out.println(usuarioPrimeraClase.toString());
            } else {
                System.out.println("Ingrese su nombre: ");
                String nombre = tcl.nextLine();
                System.out.println("Ingrese su correo: ");
                String correo = tcl.nextLine();
                    Economico usuarioEstandar = new Economico(nombre, correo,2);
                System.out.println(usuarioEstandar.toString());
            }
        }

        String [] listaPasajeros = {"Luis", "Jesus", "Daniel", "Pedro", "Patricio", "Carlos", "Sebastian"};
        String [] listaPasajeros2 = {"Luis", "Jesus", "Daniel"};
        Avion[] aviones = {
                new Boeing747(3, "A380-800", listaPasajeros),
                new AirbusA380(3, "A380-800", listaPasajeros2),
        };
        aviones[0].ingresoPasajeros2(listaPasajeros);
        aviones[1].ingresoPasajeros2(listaPasajeros2);

        for (Avion a : aviones) {

            System.out.println("--------------------------");
            System.out.println(a.mostrarDatos());
        }

        Asiento asiento1 = new Asiento();
        Asiento asiento2 = new Asiento();
        asiento2.setReservado(true);
        asiento1.reservar();
        asiento2.reservar();


    }


}