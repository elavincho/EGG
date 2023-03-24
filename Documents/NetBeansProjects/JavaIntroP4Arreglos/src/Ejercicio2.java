
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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un algoritmo que llene un vector de tamaño N con valores 
        //aleatorios y le pida al usuario un número a buscar en el vector. 
        //El programa mostrará dónde se encuentra el numero y si se encuentra 
        //repetido
        
        Scanner leer = new Scanner(System.in);
        
        Random llenar = new Random(); // importar la variable (es como el Scanner)
        
        System.out.println("Ingrese el tamaño del vector");
        
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        //Inicializamos el vector
        for (int i = 0; i < N; i++) {
            vector[i] = llenar.nextInt(100); // aleatorio del 0 al 99
        }
        // Creamos el vector
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
        
        // Hacemos la busqueda
        System.out.println("Ingrese el numero que desea buscar en el vector");
        int num = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < N; i++) {
            
            if (vector[i] == num) {
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
                contador = contador+1;
            }
        }
        
        System.out.println("El numero " + num + " aparece en " + contador + " veces");
        
    }
    
}
