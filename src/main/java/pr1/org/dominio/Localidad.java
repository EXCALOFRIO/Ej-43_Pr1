package pr1.org.dominio;

/******************************************************************
 * Clase Localidad que crea Localidades
 * 
 * @author Alejandro Ramirez Larena
 * @version 3.2, 26/10/2021
 ******************************************************************/
public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    /******************************************************************
     * Método Getter de nombre
     * 
     * @return nombre nombre de la Localidad
     ******************************************************************/
    public String getNombre() {
        return nombre;
    }

    /******************************************************************
     * Método Setter de nombre
     * 
     * @param nombre nombre de la Localidad
     ******************************************************************/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /******************************************************************
     * Método Getter de numeroDeHabitantes
     * 
     * @return nombre
     ******************************************************************/
    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    /******************************************************************
     * Método Setter de numeroDeHabitantes
     * 
     * @param numeroDeHabitantes es el numeroDeHabitantes
     ******************************************************************/
    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    /******************************************************************
     * Método toString que imprime los datos de las Localidades
     * 
     * @return numeroDeHabitantes + nombre
     ******************************************************************/
    public String toString() {
        return "\nNumero de habitantes: " + numeroDeHabitantes + " Nombre localidad: " + nombre;
    }

}