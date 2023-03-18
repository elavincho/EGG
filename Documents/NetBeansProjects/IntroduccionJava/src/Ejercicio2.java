


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
        
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo
        //muestre por pantalla.
        
        // Creamos la variable Scanner para leer los numeros del usuario 
        Scanner leer1 = new Scanner(System.in);
        // Creamos la variable tipo entero que se utiliza para leer los datos del usuario
        int num1;
        // pedimos por pantalla que ingrese el primer numero
        System.out.println("Ingresa el 1er numero");
        // leemos el primer numero
        num1 = leer1.nextInt();
        // Creamos la variable Scanner para leer los numeros del usuario 
        Scanner leer2 = new Scanner(System.in);
        // pedimos que ingrese el segundo numero
        int num2;
        // pedimos que ingrese el segundo numero
        System.out.println("Ingresa el 2do numero");
        // leemos el segundo numero
        num2 = leer2.nextInt();
        // Calculamos la suma
        int resultado = num1 + num2;
        // mostramos la suma por pantalla
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + resultado);
    }
    
}
