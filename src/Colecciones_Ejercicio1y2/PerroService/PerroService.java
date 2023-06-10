/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio1y2.PerroService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class PerroService {

    /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
        salir, se mostrará todos los perros guardados en el ArrayList. */
 /*  Ejercicio 2 
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada. */
    Scanner leer = new Scanner(System.in).useDelimiter("/n");

    public void pedirRazaPerro(ArrayList<String> raza) {
        boolean salir = false;
        do {
            System.out.println("Ingrese la Raza del Perro");
            raza.add(leer.nextLine());

            System.out.println("Desea Agregar otro Perro? (S / N)");
            String respuesta = leer.nextLine();
            if (!(respuesta.equalsIgnoreCase("S"))) {
                salir = true;
            } else {
                salir = false;
            }
        } while (!(salir));
        System.out.println("");
        System.out.println("Mostramos todas las Razas");
        for (String mostrar : raza) {
            System.out.println(mostrar);
        }
    }

    public void eliminarRaza(ArrayList<String> raza) {
        System.out.println("");
        System.out.println("Ingrese la raza que desea eliminar de la lista");
        String index = leer.nextLine();
        boolean existe = true;
        for (int i = 0; i < raza.size(); i++) {

            String r = raza.get(i);

            if (r.equals(index)) {
                raza.remove(index);
                existe = true;
            } else {
                existe = false;
            }
        }
        System.out.println("");
        if (existe == false) {
            System.out.println("La raza que desea eliminar no se encuentra en la lista");
        }
        System.out.println("");
        System.out.println("Mostramos todas las Razas");
        for (String mostrar2 : raza) {
            System.out.println(mostrar2);
        }
    }
}
