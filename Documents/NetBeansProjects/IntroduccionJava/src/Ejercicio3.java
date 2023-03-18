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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas
        //y después toda en minúsculas.
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        
        // creamos la variable scanner para leer el nombre del usuario
        Scanner leer = new Scanner(System.in);
        // creamos la variable tipo cadena (string) para leer el nombre del usuario
        String nombre;
        // pedimos al usuario que ingrese el nombre
        System.out.println("Ingrese su nombre");
        //leemos el nombre 
        nombre = leer.next();
        //mostramos el nombre por pantalla
        System.out.println("El nombre ingresado es: " + nombre);
        
    }
    
}
