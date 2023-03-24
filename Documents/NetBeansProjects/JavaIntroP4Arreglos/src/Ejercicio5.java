
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elavincho
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Realice un programa que compruebe si una matriz dada es antisimétrica. 
        //Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
        //propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
        //si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
        //obtiene cambiando sus filas por columnas (o viceversa).
        
        boolean antiSimetrica = false;
        int[][] matrizA = {{0, 1, -2}, {-1, 0, -3}, {2, 3, 0}}; // Le damos a la matriz valores predeterminados
        int[][] matrizAT = new int[3][3];
        // Mostramos la matriz A
        System.out.println("Mostramos la Matriz Principal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        
        // Creamos la matriz Simetrica
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAT[j][i] = matrizA[i][j];
            }    
        }

        // Mostramos la matriz Simetrica
        System.out.println("Matriz Simetrica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }
        
        // Creamos la matriz Antisimetrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAT[j][i] = -matrizA[i][j];
                antiSimetrica = matrizAT[j][i] == (-matrizA[i][j]); // if mejorado
            }
        }

        // Mostramos la matriz Antisimetrica
        System.out.println("Matriz Antisimetrica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }
            System.out.println("Es Anti Simetrica??" + antiSimetrica);
    }
}
