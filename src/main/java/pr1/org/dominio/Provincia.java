package pr1.org.dominio;

import java.util.ArrayList;

public class Provincia {
    private String nombre;

    public ArrayList<Municipio> coleccionMunicipios = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calcularNumeroHabitantes() {
        int numeroHabitantes = 0;
        for (int i = 0; i < coleccionMunicipios.size(); i++) {
            numeroHabitantes += coleccionMunicipios.get(i).calcularNumeroHabitantes();

        }

        return numeroHabitantes;

    }

    public String toString() {
        return "Provincia [nombre=" + nombre + ", numeroHabitantes=" + calcularNumeroHabitantes() + "]";
    }
}
