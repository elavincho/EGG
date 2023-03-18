


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
public class Ejercicio4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
        // grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        double tempCent;
        double tempFar;
        double convCentFar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la temperatura en grados centigrados");
        tempCent = leer.nextDouble();
        convCentFar = 32 + (9 * tempCent / 5);
        System.out.println("La temperatura en grados Farenheit es: " + convCentFar);
    }
    
}
