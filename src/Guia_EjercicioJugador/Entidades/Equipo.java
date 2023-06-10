/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_EjercicioJugador.Entidades;

import java.util.ArrayList;

/**
 *
 * @author elavincho
 */
public class Equipo {
    /*
        EJERCICIO JUGADOR
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
        y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
        esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
        */
    
        public String nombreEquipo;
    //Creamos la relacion entre equipo y jugador
    public ArrayList<Jugador> ListGamers = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getListGamers() {
        return ListGamers;
    }

    public void setListGamers(ArrayList<Jugador> ListGamers) {
        this.ListGamers = ListGamers;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Nombre Equipo = " + nombreEquipo + ", ListGamers = " + ListGamers + '}';
    }
}    
    
