/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_p2_ejercicio2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;
/**
 *
 * @author elavincho
 */
public class POO_P2_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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

        // Llamamos a la clase de servicio
        CafeteraServicio servicio = new CafeteraServicio();
        // LLamamos a la clase cafetera
        Cafetera cafetera = servicio.llenarCafetera();

        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    servicio.llenarCafetera();
                    break;
                case 2:
                    servicio.servirTaza(cafetera);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 4:
                    servicio.agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Muchas gracias por utilizar nuestro servicio");

            }
        } while (opcion != 5);

    }

}
