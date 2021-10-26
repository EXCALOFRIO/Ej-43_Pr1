package pr1.org.dominio;

import java.util.ArrayList;

/******************************************************************
 * Clase Provincia que agrupa Municipios
 * 
 * @author Alejandro Ramirez Larena
 * @version 3.2, 26/10/2021
 ******************************************************************/
public class Provincia {
    private String nombre;

    /******************************************************************
     * Método ArrayList de Municipios
     * 
     ******************************************************************/
    public ArrayList<Municipio> coleccionMunicipios = new ArrayList<>();

    /******************************************************************
     * Método Getter de nombre
     * 
     * @return nombre de la Provincia
     ******************************************************************/
    public String getNombre() {
        return nombre;
    }

    /******************************************************************
     * Método Setter de nombre
     * 
     * @param nombre nombre de la Provincia
     ******************************************************************/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /******************************************************************
     * Método calcularNumeroHabitantes, este metodo calcula el numeroDeHabitantes
     * 
     * @return numeroDeHabitantes
     ******************************************************************/
    public int calcularNumeroHabitantes() {
        int numeroHabitantes = 0;
        for (int i = 0; i < coleccionMunicipios.size(); i++) {
            numeroHabitantes += coleccionMunicipios.get(i).calcularNumeroHabitantes();

        }

        return numeroHabitantes;

    }

    /******************************************************************
     * Método toString que imprime los datos de las Provincia
     * 
     * @return nombre + numeroDeHabitantes
     ******************************************************************/
    public String toString() {
        return "Provincia [nombre=" + nombre + ", numeroHabitantes=" + calcularNumeroHabitantes() + "]";
    }
}
