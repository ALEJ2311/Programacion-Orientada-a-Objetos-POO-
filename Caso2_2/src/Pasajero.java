public class Pasajero {
    String nombre;
    String email;
    double boleto = 100;

    public Pasajero(String nombre, String email, double boleto) {
        this.nombre = nombre;
        this.email = email;
        this.boleto = boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBoleto() {
        return boleto;
    }

    public void setBoleto(double boleto) {
        this.boleto = boleto;
    }

    public double calcularPrecio(double boleto) {
        return boleto;
    }

    public String toString() {
        return "Pasajero: " + nombre + ", Email: " + email + ", Boleto: $" + calcularPrecio(boleto);
    }
}
