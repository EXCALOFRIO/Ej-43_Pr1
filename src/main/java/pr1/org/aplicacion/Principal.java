package pr1.org.aplicacion;

import pr1.org.dominio.Localidad;
import pr1.org.dominio.Municipio;
import pr1.org.dominio.Provincia;

/******************************************************************
 * Clase Principal inicializa los objetos de las diferentes clases y da valor a
 * sus diferentes atributos y es la encargada de llamar a los metodos.
 * 
 * @author Alejandro Ramirez Larena
 * @version 3.2, 26/10/2021
 ******************************************************************/
public class Principal {
    /******************************************************************
     * Método main con el que se ejecuta el programa
     * 
     * @param args Array de Strings
     ******************************************************************/
    public static void main(String[] args) {

        Localidad sanchinarro = new Localidad();
        sanchinarro.setNumeroDeHabitantes(400);
        sanchinarro.setNombre("Sanchinarro");
        Localidad valdebebas = new Localidad();
        valdebebas.setNumeroDeHabitantes(300);
        valdebebas.setNombre("Valdebebas");
        Localidad barajas = new Localidad();
        barajas.setNumeroDeHabitantes(300);
        barajas.setNombre("Barajas");

        Localidad alamillos = new Localidad();
        alamillos.setNumeroDeHabitantes(200);
        alamillos.setNombre("Alamillos");
        Localidad tempranales = new Localidad();
        tempranales.setNumeroDeHabitantes(100);
        tempranales.setNombre("Tempranales");
        Localidad muntrillo = new Localidad();
        muntrillo.setNumeroDeHabitantes(100);
        muntrillo.setNombre("Muntrillo");

        Municipio madrid = new Municipio();
        madrid.setNombre("Madrid");

        Municipio alcorcon = new Municipio();
        alcorcon.setNombre("Alcorcon");

        madrid.coleccionLocalidades.add(sanchinarro);
        madrid.coleccionLocalidades.add(valdebebas);
        madrid.coleccionLocalidades.add(barajas);

        madrid.calcularNumeroHabitantes();
        System.out.println(madrid.coleccionLocalidades.toString() + madrid);

        alcorcon.coleccionLocalidades.add(alamillos);
        alcorcon.coleccionLocalidades.add(tempranales);
        alcorcon.coleccionLocalidades.add(muntrillo);

        alcorcon.calcularNumeroHabitantes();
        System.out.println(alcorcon.coleccionLocalidades.toString() + alcorcon);

        Provincia commadrid = new Provincia();
        commadrid.setNombre("Comunidad de Madrid");

        commadrid.coleccionMunicipios.add(madrid);
        commadrid.coleccionMunicipios.add(alcorcon);

        commadrid.calcularNumeroHabitantes();
        System.out.println(commadrid);

    }
}
