
import java.util.Random;
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
public class EjercicioExtra3 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear una función rellene un vector con números aleatorios, pasándole
        //un arreglo por parámetro. Después haremos otra función o
        //procedimiento que imprima el vector.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del Vector");
        int tamano = leer.nextInt();
        int [] vector = new int[tamano];

        rellenarVector(vector);
        
        imprimirVector(vector);
    }
    public static void rellenarVector(int[] vector) {
    
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*(10));
        }
        System.out.println("");
    }

    public static void imprimirVector(int[] vector) {
   
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}    