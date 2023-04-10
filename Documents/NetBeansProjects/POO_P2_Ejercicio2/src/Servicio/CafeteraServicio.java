/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class CafeteraServicio {

    /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete
        Entidades con los atributos capacidadMáxima (la cantidad máxima de
        café que puede contener la cafetera) y cantidadActual (la cantidad
        actual de café que hay en la cafetera). Agregar constructor vacío y con
        parámetros así como setters y getters. Crear clase CafeteraServicio en
        el paquete Servicios con los siguiente:
        a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
        capacidad máxima.
        b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
        método recibe el tamaño de la taza y simula la acción de servir la
        taza con la capacidad indicada. Si la cantidad actual de café “no
        alcanza” para llenar la taza, se sirve lo que quede. El método le
        informará al usuario si se llenó o no la taza, y de no haberse llenado
        en cuanto quedó la taza.
        c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
        d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
        el método lo recibe y se añade a la cafetera la cantidad de café
        indicada.*/
    Scanner leer = new Scanner(System.in);

    Cafetera cafetera = new Cafetera();

    public Cafetera llenarCafetera() {
        System.out.println("LLENAR CAFETERA");
        cafetera.setCapacidadMaxima(10);
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafereta esta en su capacidad maxima.");
        return cafetera;
    }

    public void servirTaza(Cafetera llenarCafetera) {
        System.out.println("Ingrese el tamaño de la taza");
        System.out.println("1. Chico");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                if (cafetera.getCantidadActual() < opcion) {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else {
                    System.out.println("Ud. eligio un cafe chico");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 1);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                }
                break;
            case 2:
                if (cafetera.getCantidadActual() >= opcion) {
                    System.out.println("Ud. eligio cafe mediano");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 2);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else if (cafetera.getCantidadActual() == (opcion - 1)) {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("Pero le servimos un cafe chico");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 1);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                }
                break;
            case 3:
                if (cafetera.getCantidadActual() >= opcion) {
                    System.out.println("Ud. eligio cafe grande");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 3);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else if (cafetera.getCantidadActual() == (opcion - 1)) {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("Pero le servimos un cafe chico");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 1);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else if (cafetera.getCantidadActual() == (opcion - 2)) {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("Pero le servimos un cafe mediano");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 2);
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                } else {
                    System.out.println("No contamos con suficiente cafe");
                    System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
                }
                break;
        }
    }

    public void vaciarCafetera(Cafetera llenarCafetera) {
        System.out.println("Desea vaciar la cafetera (S/N)");
        String respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            cafetera.setCantidadActual(0);
            System.out.println("Ud. vacio la cafetera");
            System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
        } else {
            System.out.println("Ud. no vacio la cafetera");
            System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
        }
    }

    public void agregarCafe(Cafetera llenarCafetera) {
        System.out.println("Ingrese la cantidad de tazas de cafe que desea agregar");
        int agregar = leer.nextInt();
        cafetera.setCantidadActual(cafetera.getCantidadActual() + agregar);
        System.out.println("cantidad de cafe disponible " + cafetera.getCantidadActual());
    }
}
