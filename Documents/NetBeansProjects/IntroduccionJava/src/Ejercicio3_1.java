


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class Ejercicio3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        
        Scanner leer = new Scanner(System.in);
        String min;
        String may;
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        may = frase.toUpperCase();
        min = frase.toLowerCase();
        System.out.println("La frase en mayusculas es:" + may + " y la frase en minusculas es: " + min);
    }
    
}
