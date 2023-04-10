/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Juego {


    /*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
        a dos jugadores jugar un juego de adivinanza de números. El primer
        jugador elige un número y el segundo jugador intenta adivinarlo. El
        segundo jugador tiene un número limitado de intentos y recibe una pista
        de "más alto" o "más bajo" después de cada intento. El juego termina
        cuando el segundo jugador adivina el número o se queda sin intentos.
        Registra el número de intentos necesarios para adivinar el número y el
        número de veces que cada jugador ha ganado.*/
    Scanner leer = new Scanner(System.in);

    public int adivinarNumero;
    public int ingresarNumero;
    public boolean adivino;

    // Creamos el constructor
    public Juego() {
    }

    public Juego(int adivinarNumero, int ingresarNumero, boolean adivino) {
        this.adivinarNumero = adivinarNumero;
        this.ingresarNumero = ingresarNumero;
        this.adivino = adivino;
    }

    public void setAdivinarNumero(int adivinarNumero) {
        this.adivinarNumero = adivinarNumero;
    }

    public void setIngresarNumero(int ingresarNumero) {
        this.ingresarNumero = ingresarNumero;
    }

    // Creamos el set
    public void setAdivino(boolean adivino) {
        this.adivino = adivino;
    }

    // Creamos el get
    public int getAdivinarNumero() {
        return adivinarNumero;
    }

    public int getIngresarNumero() {
        return ingresarNumero;
    }

    public boolean isAdivino() {
        return adivino;
    }

    public Juego iniciarJuego() {

        Juego juego = new Juego();

        int contadorGanador = 0;
        boolean adivino = false;
        String respuesta = " ";
        int intentos = 3;

        System.out.println("ADIVINANZA DE NUMEROS");
        System.out.println("Jugador 1: Ingrese el numero que hay que adivinar (1 al 10)");
        juego.setIngresarNumero(leer.nextInt());

        do {

            System.out.println("Jugador 2: Ingrese un numero");
            System.out.println("Tienes " + (intentos--) + " intentos");
            juego.setAdivinarNumero(leer.nextInt());

            if (juego.getIngresarNumero() == juego.getAdivinarNumero()) {
                System.out.println("Felicidades!! Adivinaste el numero");
                adivino = true;
                contadorGanador++;
                while (adivino = true) {
                    System.out.println("Queres seguir jugando?? (S/N)");
                    respuesta = leer.next();

                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Jugador 1: Ingrese el numero que hay que adivinar (1 al 10)");
                        juego.setIngresarNumero(leer.nextInt());
                        adivino = false;
                        intentos = 4;
                        intentos--;
                        break;
                    }

                    if (respuesta.equalsIgnoreCase("N")) {
                        System.out.println("GAME OVER");
                        adivino = true;
                        break;
                    }
                }

            } else if ((juego.getIngresarNumero()) - (juego.getAdivinarNumero()) <= 1) {
                System.out.println("Caliente");
            } else if ((juego.getIngresarNumero()) - (juego.getAdivinarNumero()) <= 2) {
                System.out.println("Tivio");
            } else if ((juego.getIngresarNumero()) - (juego.getAdivinarNumero()) >= 3) {
                System.out.println("Frio");
            }

            while (intentos == 0) {

                System.out.println("Perdiste!! =(");
                System.out.println("Seguro que no queres seguir jugando?? (S/N)");
                respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("S")) {
                    adivino = false;
                    intentos = 4;
                    intentos--;
                    break;
                }

                if (respuesta.equalsIgnoreCase("N")) {
                    System.out.println("GAME OVER");
                    adivino = true;
                    break;
                }
            }
            System.out.println("Ganaste: " + contadorGanador + " veces!!");
        } while (!(adivino));
        return juego;
    }
}
