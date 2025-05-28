
package com.mycompany.semana7_b1_poo;
/**
 *
 * @author Personal
 */
public class Libretas {
    
    private String nombre;
    private int[] cedula;
    private String carrera;
    private double [] notas;

    public Libretas(String nombre, int[] cedula, String carrera, double[] notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCedula() {
        return cedula;
    }

    public void setCedula(int [] cedula) {
        this.cedula = cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Libretas{" + "nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + ", notas=" + notas + '}';
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Carrera: " + carrera);
        
        System.out.println("Lista de notas: ");
        for( double nota : notas){
            System.out.println("- " + nota);
        
        }
        //System.out.println("Promedio: " + promNotas());
        //System.out.println("Promedio Caulitativo: " + promCualitativo());
        //System.out.println("Estado: " + aproRepo());
    }
    
    public double promNotas(){
        double sum = 0;
        for (int i = 0; i < notas.length; i++) {
            sum += notas[i];
        }
        
        return sum / notas.length;
    }
    
    public String promCualitativo(){
        double promedio = promNotas();
        if(promedio >= 0 && promedio <= 4){
            return "Noob";
        }else{
            if(promedio >= 4.1 && promedio <= 7){
                return "Malo";
            }else{
                if(promedio >= 7.1 && promedio <= 9 ){
                    return "Bueno";
                }else{
                    if(promedio >= 9.1 && promedio <= 10){
                        return "Sobresaliente";
                    }
                }
            }
        }
        return null;
    }
    
    public String aproRepo(){
        double promedio = promNotas();
        if(promedio >= 0 && promedio <= 6.9){
            return "Reporbado";
        }else{
            if(promedio >= 7 && promedio <= 10){
                return "Aprobado";
            }
        }
        return null;
    }
}
