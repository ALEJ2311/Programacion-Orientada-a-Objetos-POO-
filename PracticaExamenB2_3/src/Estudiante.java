public class Estudiante extends Persona {
    int id;
    String ciclo;

    public Estudiante(String nombre, String apellido, int edad, int id, String ciclo) {
        super(nombre, apellido, edad);
        this.id = id;
        this.ciclo = ciclo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", Ciclo: " + ciclo;
    }
}
