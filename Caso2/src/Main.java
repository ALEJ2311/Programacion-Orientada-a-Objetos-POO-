import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Contenido[] contenidos = { //Polimorfismo y creacion de arreglo de objetos
                new Pelicula(120),
                new Serie(3,10),
                new Documental("WWII"),
        };

        for (Contenido c : contenidos) {
            System.out.println(c.mostrarDetalles());
        }

        int limite = 2;
        for (int i = 0; i < limite; i++) {
            System.out.println("Es usted un usuario Premium?(S/N)");
            String respuesta = tcl.nextLine();
            if(respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese su nombre: ");
                String nombre = tcl.nextLine();
                System.out.println("Ingrese su correo: ");
                String correo = tcl.nextLine();
                UsuarioPremium usuarioPremium = new UsuarioPremium(nombre, correo);
                System.out.println(usuarioPremium.toString());
            } else {
                System.out.println("Ingrese su nombre: ");
                String nombre = tcl.nextLine();
                System.out.println("Ingrese su correo: ");
                String correo = tcl.nextLine();
                UsuarioEstandar usuarioEstandar = new UsuarioEstandar(nombre, correo);
                System.out.println(usuarioEstandar.toString());
            }
        }



    }
}