public class Ropa extends Producto{

    public Ropa(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Nombre: " + nombre + ", Precio: $" + precio + " (Ropa)");
    }

    public String getTipo() {
        return "Ropa";
    }
}
