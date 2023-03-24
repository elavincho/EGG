
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
        //1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
        //idénticas. Crear un programa que permita introducir un cuadrado por
        //teclado y determine si este cuadrado es mágico o no. El programa
        //deberá comprobar que los números introducidos son correctos, es decir,
        //están entre el 1 y el 9.
        
        Scanner leer = new Scanner(System.in);
        
        int [][] cuadrado = new int [3][3];
        int sumaDiag = 0;
        int sumafila = 0;
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        int columna1 = 0;
        int columna2 = 0;
        int columna3 = 0;
        int sumaDiag2 = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero del 1 al 9 para la fila " + i + " columna " + j);
                    cuadrado[i][j] = leer.nextInt();
                    if (cuadrado [i][j] < 0 || cuadrado [i][j] > 9) {
                        System.out.println("El numero ingresado no es valido, ingreselo nuevamente");
                    }
                }while (cuadrado[i][j] < 0 || cuadrado[i][j] > 9);
            }
        }
        
        System.out.println("Mostramos la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j]);
                
            }
            System.out.println("");
        }
        
        sumaDiag = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        sumaDiag2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        
        System.out.println("La suma de la primer diagonal es: " + sumaDiag);
        System.out.println("La suma de la segunda diagonal es: " + sumaDiag2);
        
        for (int i = 0; i < 3; i++) {
            fila1 += cuadrado[i][0];
            fila2 += cuadrado[i][1];
            fila3 += cuadrado[i][2];
        }
        
        System.out.println("La suma de la primer fila es: " + fila1);
        System.out.println("La suma de la segunda fila es: " + fila2);
        System.out.println("La suma de la tercer fila es: " + fila3);
        
        for (int j = 0; j < 3; j++) {
            columna1 += cuadrado[0][j];
            columna2 += cuadrado[1][j];
            columna3 += cuadrado[2][j];
        }
        
        System.out.println("La suma de la primer columna es: "+ columna1);
        System.out.println("La suma de la segunda columna es: " + columna2);
        System.out.println("La suma de la tercer columna es: " + columna3);
        
        if (columna1 == columna2 && columna2 == columna3 && columna3== fila1 && columna3 == fila1 && columna3 == fila3 && fila3 == sumaDiag && fila3 == sumaDiag2 ) {
            System.out.println("La matriz es magica");
        }else {
            System.out.println("La matriz no es magica");
        }
    }
}
   