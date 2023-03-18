
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escriba un programa que pida una frase o palabra y valide si la primera 
        //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
        //de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
        //se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Substring 
        //y equals() de Java.

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
                
        boolean bol = frase.startsWith("A");
        
        if (bol) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        System.out.println("---------------------------------------------");
        
        System.out.println("Otro metodo");
        System.out.println("La frase es: " + frase);
        
        String letra = (frase.substring(0,1));
        System.out.println("La primera letra es: " + letra);
        if (letra.equalsIgnoreCase("A")) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
        
        
        
        
    }


    
}
