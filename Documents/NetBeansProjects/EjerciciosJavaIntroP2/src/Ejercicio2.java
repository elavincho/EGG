
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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        //el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
        //Incorrecto. Nota: investigar la función equals() en Java.
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        System.out.println("Ingrese una frase");
        cadena = leer.nextLine();
        
             
        if (cadena.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        
    }
    
} 
