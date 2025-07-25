public class Electronicos extends Producto{

    public Electronicos(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Nombre: " + nombre + "Precio: $" + precio + " (Electronicos)");
    }

    public String getTipo() {
        return "Electronicos";
    }
}
