public class Pelicula extends Contenido{
    private int duracion; //minutos

    public Pelicula(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    @Override
    String mostrarDetalles() {
        return "Duracion de la Pelicula: " + duracion + " minutos"+ "Solo 1 capitulo";
    }
}
