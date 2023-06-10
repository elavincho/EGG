/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_Ejercicio1;

import RelacionesEntreClases_Ejercicio1.Entidades.Perro;
import RelacionesEntreClases_Ejercicio1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Instanciamos un perro
        Perro perroOne = new Perro();
        perroOne.setNombrePerro("Pupi");
        perroOne.setRaza("Caniche");
        perroOne.setEdadPerro(2);
        perroOne.setTamano("Chico");
        //Instanciamos otro perro
        Perro perroTwo = new Perro();
        perroTwo.setNombrePerro("Chiquito");
        perroTwo.setRaza("Salchicha");
        perroTwo.setEdadPerro(4);
        perroTwo.setTamano("Mediano");
        //Creamos una lista de perros
        ArrayList<Perro> listDogs = new ArrayList<>();
        //Agregamos los perros a la lista
        listDogs.add(perroOne);
        listDogs.add(perroTwo);

        //Instanciamos a una persona
        Persona duenoOne = new Persona();
        duenoOne.setNombrePersona("Lola");
        duenoOne.setApellido("Mora");
        duenoOne.setEdadPersona(23);
        duenoOne.setDocumento(1234567);
        //Instanciamos a otra persona
        Persona duenoTwo = new Persona();
        duenoTwo.setNombrePersona("Juana");
        duenoTwo.setApellido("Manso");
        duenoTwo.setEdadPersona(28);
        duenoTwo.setDocumento(7654321);
        //Creamos una lista de personas
        ArrayList<Persona> listOwners = new ArrayList<>();
        //Agregamos a las personas en la lista
        listOwners.add(duenoOne);
        listOwners.add(duenoTwo);

        System.out.println("ADOPCION DE PERROS");
        System.out.println("");
        System.out.println("Mostramos a los posibles Dueños");
        System.out.println(listOwners);
        System.out.println("");
        System.out.println("Mostramos los Perros");
        System.out.println(listDogs);
        System.out.println("");

        for (Persona aux : listOwners) {

            System.out.println("Ingrese el Nombre la Persona que va a Adoptar");
            String adoptanteOne = leer.next();

            if (adoptanteOne.equalsIgnoreCase(aux.getNombrePersona())) {

                System.out.println("Ingrese el Nombre del Perro que desea Adoptar");
                String adoptadoOne = leer.next();

                for (int j = 0; j < listDogs.size(); j++) {

                    if (adoptadoOne.equalsIgnoreCase(listDogs.get(j).getNombrePerro())) {

                        aux.setDog(listDogs.get(j));
                        listDogs.remove(j);
                    }
                }
            }
        }
        System.out.println("");
        for (Persona aux : listOwners) {
            if (aux.getDog() == null) {
                System.out.println(aux.getNombrePersona() + " No ha adoptado ningun Perro.");
            } else {
                System.out.println(aux.getNombrePersona() + " Felicidades, ha adoptado a " + aux.getDog().getNombrePerro());
            }
        }

    }
}
