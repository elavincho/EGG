/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_EjercicioJugador;

import Guia_EjercicioJugador.Entidades.Equipo;
import Guia_EjercicioJugador.Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Guia_EjercicioJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        EJERCICIO JUGADOR
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
        y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
        esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
         */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String salir;
        // Llamamos a la clase equipo
        Equipo team = new Equipo();
        System.out.println("Ingrese el Nombre del Equipo");
        team.setNombreEquipo(leer.next());
        //Creamos una lista de jugadores
        ArrayList<Jugador> listGamer = new ArrayList<>();
        do {

            //Llamamos a la clase jugador
            Jugador gamer = new Jugador();
            System.out.println("Ingrese el Nombre del Jugador");
            gamer.setNombre(leer.next());
            System.out.println("Ingrese el Apellido del Jugador");
            gamer.setApellido(leer.next());
            System.out.println("Ingrese la posicion del Jugador");
            gamer.setPosicion(leer.next());
            System.out.println("Ingrese el Numero del Jugador");
            gamer.setNumero(leer.nextInt());

            //Agregamos a los jugadores a la lista
            listGamer.add(gamer);

            System.out.println("Queres Agregar otro Jugador?? (S / N)");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("S"));
        //Agregamos a los jugadores al Equipo
        team.setListGamers(listGamer);
        System.out.println("");
        System.out.println("Mostramos al Equipo");
        System.out.println(team);

    }
}
