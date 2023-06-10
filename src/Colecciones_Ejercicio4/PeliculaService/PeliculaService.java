/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ejercicio4.PeliculaService;

import Colecciones_Ejercicio4.Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class PeliculaService {

    /*
        Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
        tendremos una clase Pelicula con el título, director y duración de la película (en horas).
        Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
        que se pide a continuación:
        En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
        todos sus datos y guardándolos en el objeto Pelicula.
        Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
        crear otra Pelicula o no.
        Después de ese bucle realizaremos las siguientes acciones:

        • Mostrar en pantalla todas las películas.
        • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        pantalla.
        • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
        pantalla.
        • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> pelis) {
        String salir;
        do {
            //Creamos el objeto tipo pelicula
            Pelicula movie = new Pelicula();

            System.out.println("Ingrese el Titulo de la Pelicula");
            movie.setTitulo(leer.next());
            System.out.println("Ingrese el Director de la Pelicula");
            movie.setDirector(leer.next());
            System.out.println("Ingrese la Duracion de la Pelicula (HH / MM)");
            movie.setDuracion(leer.nextDouble());
            //Agregamos la pelicula al ArrayList
            pelis.add(movie);
            //Preguntamos si quiere agregar otra pelicula
            System.out.println("Queres agregar otra Pelicula??  (S / N)");
            salir = leer.next();
        } while (!salir.equalsIgnoreCase("n"));
        System.out.println("");

    }
    //• Mostrar en pantalla todas las películas.
    public void mostrarTodasLasPelis(ArrayList<Pelicula> pelis) {
        System.out.println("Mostramos todas las peliculas");
        for (Pelicula mostrar : pelis) {
            System.out.println(mostrar);
        }
        System.out.println("");
    }
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPelisMasUnaHora(ArrayList<Pelicula> pelis) {
        System.out.println("Las Peliculas Mayores a 1 hora son:");
        for (Pelicula movie : pelis) {
            if (movie.getDuracion() > 1) {
                System.out.println(movie);
            }
        }
        System.out.println("");
    }
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    //pantalla.
    public void ordenarDuracionMayorAMenor(ArrayList<Pelicula> pelis){
        System.out.println("Ordenamos las Peliculas de Mayor a Menor");
        pelis.sort(Comparator.comparing(Pelicula::getDuracion).reversed());
        for (Pelicula mostrar3 : pelis) {
            System.out.println(mostrar3);
        }
        System.out.println("");
    }
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    //pantalla.
    public void ordenarDuracionMenorAMayor(ArrayList<Pelicula> pelis){
        System.out.println("Ordenamos las Peliculas de Menor a Mayor");
        pelis.sort(Comparator.comparing(Pelicula::getDuracion));
        for (Pelicula mostrar4 : pelis) {
            System.out.println(mostrar4);
        }
        System.out.println("");
    }
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorTitulo(ArrayList<Pelicula> pelis){
        System.out.println("Ordenamos las Peliculas por Titulo");
        pelis.sort(Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula mostrar5 : pelis) {
            System.out.println(mostrar5);
        }
        System.out.println("");
    }
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorDirector(ArrayList<Pelicula> pelis){
        System.out.println("Ordenamos las Peliculas por Director");
        pelis.sort(Comparator.comparing(Pelicula::getDirector));
        for (Pelicula mostrar6 : pelis) {
            System.out.println(mostrar6);
        }
    }
}
