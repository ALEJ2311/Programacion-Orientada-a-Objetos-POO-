abstract class Producto implements ProductoPr {
    String nombre;
    double precio;



    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;


    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void mostrarPrecio();
    public abstract String getTipo();
}
