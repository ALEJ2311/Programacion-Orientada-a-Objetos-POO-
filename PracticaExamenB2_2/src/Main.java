//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto electronico = new Electronicos("Laptop", 1200.00);
        Producto ropa = new Ropa("Camisa",29.99);

        ProductosDB productosDB = new ProductosDB();


        Producto[] productos = {electronico, ropa};
        for (Producto producto : productos) {
            productosDB.guardarProducto(producto);
        }
        for (Producto producto : productos) {
            producto.mostrarPrecio();
        }

        System.out.println("Productos guardados en la base de datos:");
        productosDB.mostrarProductos();


    }
}