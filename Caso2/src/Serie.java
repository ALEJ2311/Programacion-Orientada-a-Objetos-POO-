public class Serie extends Contenido{
    private int temporadas;
    private int capitulos;//número de temporadas

    public Serie(int temporadas, int capitulos) {
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    String mostrarDetalles() {
        return "La serie cuenta con: " + temporadas + " temporadas y " + capitulos + " capitulos por temporada.";
    }
}
