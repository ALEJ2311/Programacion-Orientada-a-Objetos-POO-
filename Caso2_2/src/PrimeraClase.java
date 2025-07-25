import java.util.Scanner;

public class PrimeraClase extends Pasajero {
    private String tipoAsiento = "Primera Clase";

    public PrimeraClase(String nombre, String email, double boleto) {
        super(nombre, email, boleto);

    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public double calcularPrecio(double boleto) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Avion: (1/2)");
        int opcion = tcl.nextInt();
        tcl.nextLine();
        if (opcion == 1) {
            return (boleto + 5) * 3;
        } else if (opcion == 2) {
            return (boleto + 5) * 2;
        } else {
            System.out.println("Opción inválida. Se devolverá el precio original.");
            return boleto;
        }
    }

    public String toString() {
        return super.toString() + " PRIMERA CLASE";
    }
}