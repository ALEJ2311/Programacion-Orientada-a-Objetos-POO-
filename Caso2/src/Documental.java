public class Documental extends Contenido {
    String tema; //tema del documental

    public Documental(String tema) {
        this.tema = tema;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }


    @Override
    String mostrarDetalles() {
        return "Tema del Documental: " + tema;
    }
}
