/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.EjerciciosGuia;

import java.util.ArrayList;

/**
 *
 * @author elavincho
 */
public class EjercicioListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // EJERCICIO LISTA LIBROS
        // Crea una lista de Libros y muestra el título de cada uno con un bucle.
        
        //Creamos la lista
        ArrayList<Libro> libreria = new ArrayList();
        //Creamos el objeto tipo libro
        Libro book = new Libro();
        libreria.add(book);
        for (Libro titulo: libreria) {
            System.out.println(titulo);
        }
        
        //Otro metodo de forEach
        
        libreria.forEach((titulo) -> {
            System.out.println(titulo);
        });
    }
}
