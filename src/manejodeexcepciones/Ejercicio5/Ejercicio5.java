/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeexcepciones.Ejercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elavincho
 *
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int numAleatorio = (aleatorio.nextInt(500) + 1);
        int num = 0;
        int intentos = 1;

        try {//Intentar
            do {
                System.out.println("*****ADIVINE EL NUMERO SECRETO DEL 1 AL 500******");
                System.out.println("");
                System.out.println("Ingrese el Numero");
                num = leer.nextInt();
                System.out.println("");
                if (numAleatorio < num) {
                    System.out.println(">>> MENOS <<<");
                    intentos++;
                } else if (numAleatorio > num) {
                    System.out.println(">>> MAS <<<");
                    intentos++;
                } else if (numAleatorio != num) {//Codigo para contar los caracteres
                    intentos++;                  //que no son numeros como intentos
                }
                System.out.println("");
            } while (num != numAleatorio);
            if (num == numAleatorio) {
                System.out.println("");
                System.out.println("***Felicidades, Ganaste!!!***");
                System.out.println("El Numero Secreto es: " + numAleatorio);

            }
        } catch (Exception e) {//Agarrar
            System.out.println("El caracter ingresado no es un numero!");
        } finally { //El codigo que se ejecuta siempre
            if (num == numAleatorio) {
                System.out.println("***Ganaste en: " + intentos + " intentos!!");
            } else {
                System.out.println("***Perdiste***");
                System.out.println("Intentos: " + intentos);
            }
            System.out.println("Fin del programa!!!");
        }
    }
}
