/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_Ejercicio3.BarajaService;

import RelacionesEntreClases_Ejercicio3.Entidades.Carta;
import RelacionesEntreClases_Ejercicio3.Entidades.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class BarajaService {

    /*
        Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
        y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
        contener un método toString() que retorne el número de carta y el palo. La baraja estará
        compuesta por un conjunto de cartas, 40 exactamente.
        Las operaciones que podrá realizar la baraja son:
        • barajar(): cambia de posición todas las cartas aleatoriamente.
        • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
        se haya llegado al final, se indica al usuario que no hay más cartas.
        • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
        • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
        cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
        debemos indicárselo al usuario.
        • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
        indicárselo al usuario
        • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
        luego se llama al método, este no mostrara esa primera carta.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Palo> palo = new ArrayList<>();

    public void crearPalos() {

        palo.add(new Palo("Espada"));
        palo.add(new Palo("Basto"));
        palo.add(new Palo("Oro"));
        palo.add(new Palo("Copa"));
    }
    ArrayList<Carta> cartas = new ArrayList<>();
    
    public void crearCartas() {

        crearPalos();
        if (palo.size() < 0) {
            System.out.println("Ya existe una Baraja!");
        } else {
            System.out.println("Creando Baraja");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

            for (int i = 0; i < palo.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Carta(numero[j], palo.get(i)));
                }
            }
            System.out.println("Se creo la Baraja Correctamente.");
        }
    }
    
    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        System.out.println("Mezclando Cartas...");
        /*
        for (int i = 0; i < cartas.size(); i++) {
                
            int x = (int)(Math.random() * cartas.size());
            Carta aux = cartas.get(i);
            cartas.set(i, cartas.get(x));
            cartas.set(x, aux);
        }
         */
        Collections.shuffle(cartas);
        mostrarBaraja();
        System.out.println("Se Mezclo Correctamente las Cartas.");
    }

    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public Carta siguienteCarta() {
        Carta carta = new Carta();
        if (cartas.size() == 0) {
            System.out.println("No quedan Cartas.");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles son: " + cartas.size());
        System.out.println("");
        for (Carta mostrar3 : cartas) {
            System.out.println(mostrar3);
        }
    }

    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    // cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicárselo al usuario.
    
    ArrayList <Carta> cartasDadas = new ArrayList<>();
    
    public void darCartas() {
        System.out.println("Ingrese la Cantidad de Cartas que desea recibir.");
        int cantCartas = leer.nextInt();

        if (cantCartas > cartas.size()) {
            System.out.println("No hay Susficientes Cartas!");
        } else {
            int cont = 0;
            while (cont < cantCartas) {
                System.out.println("Se dio la carta " + siguienteCarta() + " al jugador.");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //  indicárselo al usuario
    
    public void cartasMonton(){
        System.out.println("Cartas del monton: " + cartasDadas.size());
        for (Carta mostrar : cartasDadas) {
            System.out.println(mostrar);
        }
    }
    
    //• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    // luego se llama al método, este no mostrara esa primera carta.
    
    public void mostrarBaraja(){
        System.out.println("Las Cartas que quedan son:" + cartas.size());
        for (Carta mostrar2 : cartas) {
            System.out.println(mostrar2);
        }
    }
}
