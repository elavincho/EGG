/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    /*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
    de rango).
     */
    public static void main(String[] args) {

        //Crear una función rellene un vector con números aleatorios, pasándole
        //un arreglo por parámetro. Después haremos otra función o
        //procedimiento que imprima el vector.
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[8];
        rellenarVector(vector);
        imprimirVector(vector);

        try { //Intentar
            //Bloque de codigo donde puede ocurrir la excepcion
            System.out.println("Ingrese la Posicion del Vector que desea conocer:");
            int posicion = leer.nextInt();

            System.out.println("El valor de la Posicion " + posicion + " es: " + vector[posicion]);

        } catch (Exception e) { //Agarrar
            //Se ejecuta al dispararse una excepcion en el bloque try
            System.out.println("La posicion ingresada no existe!!!");
        } finally {
            //Es el codigo que siempre se ejecuta
            System.out.println("Fin del Programa!");
        }

        // throw: lanza una excepcion cualquiera. De esta forma podemos provocar 
        //la excepcion y forzarla a que se ejecute.
        //throws: Arroja. Determinar que excepciones puede lanzar un metodo.
    }

    public static void rellenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (10));
        }
        System.out.println("");
    }

    public static void imprimirVector(int[] vector) {
        System.out.println("Mostramos el Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

}
