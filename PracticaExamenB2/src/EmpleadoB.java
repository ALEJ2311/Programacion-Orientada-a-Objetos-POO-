public abstract class EmpleadoB implements EmpleadoI {
    protected String nombre;
    protected String id;
    protected int horasTrabajadas;

    public EmpleadoB(String nombre, String id, int horasTrabajadas) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularSalario();

    public abstract String getRol();
}

