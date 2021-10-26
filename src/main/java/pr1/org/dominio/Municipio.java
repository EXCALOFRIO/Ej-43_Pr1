package pr1.org.dominio;

import java.util.ArrayList;

/******************************************************************
 * Clase Municipio que agrupa Localidades
 * 
 * @author Alejandro Ramirez Larena
 * @version 3.2, 26/10/2021
 ******************************************************************/
public class Municipio {
    private String nombre;

    /******************************************************************
     * Método ArrayList de Localidades
     * 
     ******************************************************************/
    public ArrayList<Localidad> coleccionLocalidades = new ArrayList<>();

    /******************************************************************
     * Método Getter de nombre
     * 
     * @return nombre nombre del Municipio
     ******************************************************************/
    public String getNombre() {
        return nombre;
    }

    /******************************************************************
     * Método Setter de nombre
     * 
     * @param nombre nombre del Municipio
     ******************************************************************/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /******************************************************************
     * Método toString que imprime los datos de los Municipios
     * 
     * @return numeroDeHabitantes + nombre
     ******************************************************************/
    public String toString() {
        return "\nMunicipio [nombre=" + nombre + ", numeroDeHabitantes=" + calcularNumeroHabitantes() + "]\n";
    }

    /******************************************************************
     * Método calcularNumeroHabitantes, este metodo calcula el numeroDeHabitantes
     * 
     * @return numeroDeHabitantes
     ******************************************************************/
    public int calcularNumeroHabitantes() {
        int numeroDeHabitantes = 0;
        for (int i = 0; i < coleccionLocalidades.size(); i++) {
            numeroDeHabitantes += (coleccionLocalidades.get(i)).getNumeroDeHabitantes();

        }

        return numeroDeHabitantes;

    }

}
