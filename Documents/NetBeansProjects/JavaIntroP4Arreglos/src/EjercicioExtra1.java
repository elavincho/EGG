
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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un algoritmo que calcule la suma de todos los elementos de un
        //vector de tamaño N, con los valores ingresados por el usuario.

        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        
        int[] vector = new int[tamano];
        
        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < tamano; i++) {
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        for (int numeros : vector) { // for mejorado!! 
            suma += numeros;
        }
        System.out.println("");
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
