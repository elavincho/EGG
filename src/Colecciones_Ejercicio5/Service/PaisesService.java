/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio5.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class PaisesService {

    /*
        Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
        usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
        conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
        si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
        los servicios en la clase correspondiente)
        Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
        cómo se ordena un conjunto.
        Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
        buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
        usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
        al usuario.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void guardarPaises(HashSet<String> paisesSet) {
        String salir;
        do {
            System.out.println("Ingrese un Pais");
            String pais = leer.next();
            paisesSet.add(pais);
            System.out.println("Queres agregar otro Pais?? (S / N)");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));
        for (String mostrar : paisesSet) {
            System.out.println(mostrar);
        }
        System.out.println("");
    }

    //Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    //cómo se ordena un conjunto.
    public void ordenarAlfabeticamente(HashSet<String> paisesSet) {
        System.out.println("Mostramos los Paises ordenados Alfabeticamente");
        //Para ordenar conjuntos tenemos que convertirlos a lista
        ArrayList<String> paisesLista = new ArrayList(paisesSet);
        Collections.sort(paisesLista);
        for (String mostrar2 : paisesLista) {
            System.out.println(mostrar2);
        }
        System.out.println("");
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
        buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
        usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
        al usuario.*/
    public void recorrerEliminar(HashSet<String> paisesSet) {

        String salir;
        do {
            System.out.println("Recorrer y Eliminar");
            System.out.println("Ingrese el Pais que quiere Eliminar");
            boolean existe = true;
            String eliminar = leer.next();
            Iterator<String> iter = paisesSet.iterator();
            while (iter.hasNext()) {
                if (iter.next().equals(eliminar)) {
                    iter.remove();
                    existe = true;
                } else {
                    existe = false;
                }
            }
            if (existe == false) {
                System.out.println("El Pais ingresado no se encuentra en la lista");
            }
            System.out.println("");
            System.out.println("Los Paises restantes son:");
            for (String mostrar3 : paisesSet) {
                System.out.println(mostrar3);
            }
            System.out.println("");
            System.out.println("Queres eliminar otro Pais(S / N)");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("Los Paises restantes son:");
        for (String mostrar3 : paisesSet) {
            System.out.println(mostrar3);
        }
    }
}
