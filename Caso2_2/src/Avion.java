import java.util.Scanner;

public class Avion {
    private int asientos;
    private String modelo;
    private String[] listPasajero;

    public Avion(int asientos, String modelo, String listaPasajero[]) {
        this.asientos = asientos;
        this.modelo = modelo;
        this.listPasajero = listaPasajero;
    }
    public int getAsientos() {
        return asientos;
    }
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String[] getListPasajero() {
        return listPasajero;
    }
    public void setListPasajero(String[] listPasajero) {
        this.listPasajero = listPasajero;
    }

    public void ingresoPasjeros(String[] listPasajeros){
        String lista2[] = new String[10];
        for (int i = 0; i < listPasajeros.length; i++) {
            if (asientos > i) {
                listPasajero[i] = listPasajeros[i];

            }else{
                lista2[i] = listPasajeros[i];
            }
        }

        for (int i = 0; i < lista2.length; i++) {
            System.out.println(lista2[i]);
        }
        System.out.println("------------------------");
        for (int i = 0; i < listPasajero.length; i++) {
            System.out.println(listPasajero[i]);
        }
    }

    public String[] ingresoPasajeros2(String[] listPasajeros) {
        for (int i = 0; i < listPasajeros.length; i++) {
            if (asientos > i) {
                listPasajero[i] = listPasajeros[i];
            }

        }
        return listPasajero;
    }
    public String mostrarDatos() {
        return "Modelo: " + modelo + "\n" +
               "Asientos: " + asientos + "\n" +
               "Lista de Pasajeros: " + String.join(", ", listPasajero);
    }
}
