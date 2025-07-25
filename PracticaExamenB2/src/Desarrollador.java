public class Desarrollador extends EmpleadoB{
    int pagoPorHora = 50; // Pago por hora para un desarrollador

    public Desarrollador(String nombre, String id, int horasTrabajadas) {
        super(nombre, id, horasTrabajadas);
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public String getRol() {
        return "Desarrollador";
    }


}
