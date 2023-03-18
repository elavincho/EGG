/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintrop3subprogramas;

import java.util.Scanner;

/**
 *
 * @author elavincho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Diseñe una función que pida el nombre y la edad de N personas e imprima 
        //los datos de las personas ingresadas por teclado e indique si son mayores 
        //o menores de edad. Después de cada persona, el programa debe preguntarle 
        //al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
        //ingrese la palabra “No”.
        
        Scanner leer = new Scanner(System.in);
        
        boolean bucle = true;
        String respuesta;
        respuesta = "SI";
        

        do {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese su edad");
            int edad;
            edad = leer.nextInt();
            System.out.println("Hola " + nombre + " tenes " + edad + " y sos " + verificarEdad(edad) + " de edad.");
            System.out.println("Desea ingresar a otra persona?? (SI/NO");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Salio del programa");
                bucle = false;
            }
        }while(bucle);
        
        //mostrar si las personas son mayores de edad
        
        //Imprimir la funcion
    }
    
    public static String verificarEdad(int edad) {
        
        if (edad >= 18) {
            return "mayor";
        }else {
             return "menor";
        }
        
    }
}
