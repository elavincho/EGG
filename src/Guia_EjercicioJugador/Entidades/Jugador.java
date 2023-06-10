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
public class Jugador {
    /*
        EJERCICIO JUGADOR
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
        y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
        esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
        */
    
    public String nombre;
    public String apellido;
    public String posicion;
    public int numero;
    //Relacionamos la clase jugador y equipo
    public Equipo team;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre = " + nombre + ", Apellido = " + apellido + ", Posicion = " + posicion + ", Numero = " + numero + '}';
    }
}
