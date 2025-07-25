public class Gerente extends EmpleadoB{
    int pagoPorHora = 100;
    public Gerente(String nombre, String id, int horasTrabajadas) {
        super(nombre, id, horasTrabajadas);
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public String getRol() {
        return "Gerente";
    }


}
