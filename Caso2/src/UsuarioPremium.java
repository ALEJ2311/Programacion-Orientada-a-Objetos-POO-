public class UsuarioPremium extends Usuario{ //puede ver en 4k
    private String Calidad = "Calidad 4k";

    public UsuarioPremium(String nombre, String email) {
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
