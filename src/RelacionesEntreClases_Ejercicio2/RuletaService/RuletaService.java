/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_Ejercicio2.RuletaService;

import RelacionesEntreClases_Ejercicio2.Entidades.Jugador;
import RelacionesEntreClases_Ejercicio2.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class RuletaService {

    /* Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
    un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
    se dispara y se moja. Las clases por hacer del juego son las siguientes:*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Random aleatorio = new Random();

    /*
    Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
    del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
    tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
    Métodos: */
 /*• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.*/
    public void llenarRevolver(Revolver armaObj) {
        armaObj.setPosicionActual(aleatorio.nextInt(6) + 1);
        armaObj.setPosicionAgua(aleatorio.nextInt(6) + 1);
    }

    /*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    public boolean mojar(Revolver armaObj) {
        boolean muerto = false;
        if (armaObj.getPosicionActual() == armaObj.getPosicionAgua()) {
            muerto = true;
        }
        return muerto;
    }

    /*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    public void siguienteChorro(Revolver armaObj) {
        if (armaObj.getPosicionActual() < 6) {
            armaObj.setPosicionActual(armaObj.getPosicionActual() + 1);
        } else if (armaObj.getPosicionActual() == 6) {
            armaObj.setPosicionActual(1);
        }
    }

    /*• toString(): muestra información del revolver (posición actual y donde está el agua) */
    public void mostrarInfo(Revolver armaObj) {
        armaObj.toString();
    }

    /*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
    jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
    si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
    debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
    Métodos:*/
 /*• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    devuelve true, sino false.*/
    public boolean disparo(Jugador gamer, Revolver armaObj) {
        boolean muerto = false;
        if (mojar(armaObj)) {
            gamer.setMojado(true);
            muerto = true;
        }
        return muerto;
    }

    /*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
    Revolver
    Métodos:
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.*/
    ArrayList<Jugador> gamerList = new ArrayList<>();

    public void llenarJuego(ArrayList<Jugador> gamerList, Revolver armaObj) {

        System.out.println("ingrese la cantidad de jugadores (Max 6 Jugadores)");
        int cantJugadores = leer.nextInt();
        int num = 0;
        if (num > 6) {
            num = 6;
        }
        do {
            Jugador gamer = new Jugador();

            System.out.println("Ingrese el Nombre del Jugador");

            gamer.setNombre(leer.next() + " " + (num + 1));
            gamer.setId(num + 1);

            gamerList.add(gamer);

            num++;
        } while (cantJugadores != num);

        System.out.println("");
        System.out.println("Mostramos la Lista de Jugadores");
       //Llenamos el arma
        llenarRevolver(armaObj);
    }

    public boolean finJuego(ArrayList<Jugador> gamerList) {
        for (int i = 0; i < gamerList.size(); i++) {
            if (gamerList.get(i).isMojado()) {
                return true;
            }
        }
        return false;
    }

    /*• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
    moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    mojar. Al final del juego, se debe mostrar que jugador se mojó.
    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public boolean ronda(Jugador gamer, Revolver armaObj) {   // hacer la ronda para que funcione el juego

        boolean siguienteRonda = true;
        if (disparo(gamer, armaObj)) {
            siguienteRonda = false;
        }
        return siguienteRonda;
    }
}
