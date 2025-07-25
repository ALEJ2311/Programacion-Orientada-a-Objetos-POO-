public class Notas {
    int id;
    String materia;
    double nota;

    public Notas(int id, String materia, double nota) {
        this.id = id;
        this.materia = materia;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }


}
