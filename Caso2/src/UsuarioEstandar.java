public class UsuarioEstandar extends Usuario {
    private String Calidad = "Calidad HD";

    public UsuarioEstandar(String nombre, String email) {
        super(nombre, email);
    }

    public String getCalidad() {
        return Calidad;
    }
    public void setCalidad(String calidad) {
        this.Calidad = calidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Calidad: " + Calidad;
    }

}
