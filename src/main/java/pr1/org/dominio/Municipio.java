package pr1.org.dominio;

import java.util.ArrayList;

public class Municipio {
    private String nombre;

    public ArrayList<Localidad> coleccionLocalidades = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "\nMunicipio [nombre=" + nombre + ", numeroDeHabitantes=" + calcularNumeroHabitantes() + "]\n";
    }

    public int calcularNumeroHabitantes() {
        int numeroDeHabitantes = 0;
        for (int i = 0; i < coleccionLocalidades.size(); i++) {
            numeroDeHabitantes += (coleccionLocalidades.get(i)).getNumeroDeHabitantes();

        }

        return numeroDeHabitantes;

    }

}
