


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
public class Ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida dos números enteros por teclado y calcule 
        //la suma de los dos. El programa deberá después mostrar el resultado de la suma

        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1, num2;
        int resultado;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + resultado);
        
    }
    
}
