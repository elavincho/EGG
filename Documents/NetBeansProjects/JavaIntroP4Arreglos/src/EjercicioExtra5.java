
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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realizar un programa que llene una matriz de tamaño NxM con valores
        //aleatorios y muestre la suma de sus elementos. 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz (MxN)");
        int M = leer.nextInt();
        int N = leer.nextInt();
        int suma = 0;
        int[][] matriz = new int [M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = (int)(Math.random()*100);
                System.out.print("[" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
