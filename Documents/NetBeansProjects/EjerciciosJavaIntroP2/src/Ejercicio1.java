
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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un programa que dado un número determine si es par o impar.

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba un numero");
        double num = leer.nextDouble();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
            
        }else {
            System.out.println("El numero es impar");
        } 
    }
    
}
