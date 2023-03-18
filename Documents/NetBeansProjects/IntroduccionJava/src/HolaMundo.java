/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //se crea una variable de cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        // se muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        // leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola mundo!! Soy " + nombre + " y estoy programando en Java!!");
    }
    
}
